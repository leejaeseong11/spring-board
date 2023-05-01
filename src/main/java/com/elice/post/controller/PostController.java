package com.elice.post.controller;

import com.elice.post.domain.Post;
import com.elice.post.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {
    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("posts", postService.getAllPosts());
        return "home";
    }

    @GetMapping("/posts/{id}")
    public String getPost(@PathVariable Long id, Model model) {
        model.addAttribute("post", postService.getPostById(id));
        return "posts/detail";
    }

    @GetMapping("/posts/new")
    public String createForm() {
        return "posts/createPostForm";
    }

    @PostMapping("/posts/new")
    public String createPost(PostForm form) {
        Post post = new Post();

        post.setTitle(form.getTitle());
        post.setContent(form.getContent());
        postService.savePost(post);

        return "redirect:/";
    }
}
