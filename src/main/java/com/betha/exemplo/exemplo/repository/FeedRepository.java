package com.betha.exemplo.exemplo.repository;

import com.betha.exemplo.exemplo.model.Feed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedRepository extends JpaRepository<Feed, Long> {
}

