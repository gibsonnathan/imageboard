package com.ndg.imageboard.service;

import com.ndg.imageboard.entity.Post;
import com.ndg.imageboard.repository.PostRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PostService {

  private final PostRepository postRepository;

  public PostService(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  public List<Post> findMostRecentPosts(Long threadId) {
    return postRepository.findMostRecentPosts(threadId);
  }

  public List<Post> findAllForThread(Long threadId) {
    return postRepository.findAllForThread(threadId);
  }
}
