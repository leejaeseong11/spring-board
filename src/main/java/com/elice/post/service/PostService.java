package com.elice.post.service;

import com.elice.post.domain.Post;
import com.elice.post.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PostService {
    @Autowired
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Post getPostById(Long id) {
        return postRepository.findById(id).orElse(null);
    }

    public Long savePost(Post post) {
        post.setUpdatedDate((new Date()));
        postRepository.save(post);
        return post.getId();
    }

    public void deletePost(Post post) {
        postRepository.delete(post);
    }

}
