package org.example.blog.service;

import org.example.blog.entity.Post;

import java.util.List;

public interface PostService {
    List<Post> getAllPosts();
    Post getPostById(Long id);
    Post savePost(Post post);
    Post updatePost(Long id, Post postDetails);
    void deletePost(Long id);
}
