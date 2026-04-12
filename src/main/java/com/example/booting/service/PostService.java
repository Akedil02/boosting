package com.example.booting.service;

import com.example.booting.DTO.PostCreatedEvent;
import com.example.booting.DTO.CreatePostRequest;
import com.example.booting.DTO.PostResponse;

public interface PostService {
    PostCreatedEvent publishPost(CreatePostRequest request);
    PostResponse getPostById(String postId);
}
