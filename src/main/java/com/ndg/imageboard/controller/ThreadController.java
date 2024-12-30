package com.ndg.imageboard.controller;

import com.ndg.imageboard.entity.Board;
import com.ndg.imageboard.entity.Post;
import com.ndg.imageboard.entity.Thread;
import com.ndg.imageboard.service.BoardService;
import com.ndg.imageboard.service.PostService;
import com.ndg.imageboard.service.ThreadService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/threads")
public class ThreadController {

  private final BoardService boardService;
  private final ThreadService threadService;
  private final PostService postService;

  public ThreadController(
      BoardService boardService, ThreadService threadService, PostService postService) {
    this.boardService = boardService;
    this.threadService = threadService;
    this.postService = postService;
  }

  @GetMapping("/{id}")
  public String index(@PathVariable Long id, Model model) {
    Thread thread = threadService.findById(id).orElse(new Thread());
    Board board = boardService.findById(thread.getBoardId()).orElse(new Board());
    List<Post> posts = postService.findAllForThread(thread.getId());
    model.addAttribute("thread", thread);
    model.addAttribute("board", board);
    model.addAttribute("posts", posts);
    return "thread";
  }
}
