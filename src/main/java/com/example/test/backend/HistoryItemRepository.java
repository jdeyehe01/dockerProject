package com.example.test.backend;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.backend.data.entity.HistoryItem;

public interface HistoryItemRepository extends JpaRepository<HistoryItem, Long> {
}
