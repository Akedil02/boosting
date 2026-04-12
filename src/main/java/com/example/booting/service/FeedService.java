package com.example.booting.service;

import com.example.booting.DTO.FeedItemResponse;

import java.util.List;

public interface FeedService {
    List<FeedItemResponse> getFeedByUserId(String userId);
}
