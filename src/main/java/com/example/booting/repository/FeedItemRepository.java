package com.example.booting.repository;

import com.example.booting.entity.FeedItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeedItemRepository extends JpaRepository<FeedItem, Long> {
    List<FeedItem> findByUserIdOrderByCreatedAtDesc(String userId);
}
