package com.apiece.springboottwitter;

import java.time.LocalDateTime;

public record Post(
        Long id,
        String content,
        LocalDateTime createdAt
) {

    public Post updateContent(String content) {
        return new Post(this.id, content, this.createdAt);
    }
}
