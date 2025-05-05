package com.apiece.springboottwitter.repository;

import com.apiece.springboottwitter.Post;

import java.util.List;
import java.util.Optional;

public interface PostRepository {

    Post save(Post post);

    List<Post> findAll();

    Optional<Post> findById(Long id);

    void deleteById(Long id);

    List<Post> findAllPaged(int page, int size);
}
