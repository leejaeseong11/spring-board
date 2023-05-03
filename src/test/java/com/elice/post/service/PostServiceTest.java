package com.elice.post.service;

import com.elice.post.domain.Post;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

@SpringBootTest
@Transactional
public class PostServiceTest {
    @Autowired
    PostService postService;
    Post post1, post2;
    @BeforeEach
    public void beforeEach() {
        post1 = new Post();
        post1.setTitle("테스트 게시글1");
        post1.setContent("테스트 게시글입니다.");
        postService.savePost(post1);
        post2 = new Post();
        post2.setTitle("테스트 게시글2");
        post2.setContent("테스트 게시글입니다.");
        postService.savePost(post2);
    }
    @Test
    public void getAllPosts() {
        List<Post> postList = postService.getAllPosts();
        assertThat(postList.size()).isEqualTo(2);
    }

    @Test
    public void getPostById() {
        Post result1 = postService.getPostById(post1.getId());
        assertThat(result1).isEqualTo(post1);
        Post result2 = postService.getPostById(post2.getId());
        assertThat(result2).isEqualTo(post2);
    }
    @Test
    public void savePost() {
        Post post3 = new Post();
        post3.setTitle("테스트 게시글3");
        post3.setContent("테스트 게시글입니다.");
        postService.savePost(post3);
        List<Post> postList = postService.getAllPosts();
        assertThat(postList.size()).isEqualTo(3);
    }
    @Test
    public void deletePost() {
        postService.deletePost(post2);
        List<Post> postList = postService.getAllPosts();
        assertThat(postList.size()).isEqualTo(1);
    }
}
