package com.ndg.imageboard.service;

import com.ndg.imageboard.repository.ThreadRepository;
import org.springframework.stereotype.Service;

@Service
public class ThreadService {

    private final ThreadRepository threadRepository;

    public ThreadService(ThreadRepository threadRepository) {
        this.threadRepository = threadRepository;
    }
}
