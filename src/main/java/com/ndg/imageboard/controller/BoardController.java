package com.ndg.imageboard.controller;

import com.ndg.imageboard.entity.Board;
import com.ndg.imageboard.entity.Post;
import com.ndg.imageboard.entity.Thread;
import com.ndg.imageboard.service.*;
import java.time.Instant;
import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/boards")
public class BoardController {

  private final BoardService boardService;
  private final ThreadService threadService;
  private final PostService postService;

  public BoardController(
      BoardService boardService, ThreadService threadService, PostService postService) {
    this.boardService = boardService;
    this.threadService = threadService;
    this.postService = postService;
  }

  @GetMapping("/{id}")
  public String index(
      Model model, @PathVariable Long id, @RequestParam(required = false) Instant before) {
    Board board = boardService.findById(id).orElse(new Board());
    List<Thread> threads =
        threadService.findTenThreadsOrderedByLatestPost(
            board.getId(), before != null ? before : Instant.now());
    Map<Thread, List<Post>> threadsToPosts = new LinkedHashMap<>();

    threads.forEach(
        thread -> {
          List<Post> posts = postService.findMostRecentPosts(thread.getId());
          threadsToPosts.put(thread, posts);
        });

    model.addAttribute("board", board);
    model.addAttribute("threadsToPosts", threadsToPosts);
    return "board";
  }
}
