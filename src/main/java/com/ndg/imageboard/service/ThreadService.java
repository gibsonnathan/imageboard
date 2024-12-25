package com.ndg.imageboard.service;

import com.ndg.imageboard.entity.Thread;
import com.ndg.imageboard.repository.ThreadRepository;
import java.time.Instant;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ThreadService {

  private final ThreadRepository threadRepository;

  public ThreadService(ThreadRepository threadRepository) {
    this.threadRepository = threadRepository;
  }

  public List<Thread> findTenThreads(Long boardId, Instant before) {
    return threadRepository.findTenThreads(boardId, before);
  }
}
