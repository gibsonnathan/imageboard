package com.ndg.imageboard.controller;

import com.ndg.imageboard.entity.Board;
import com.ndg.imageboard.entity.Thread;
import com.ndg.imageboard.service.*;
import java.time.Instant;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/boards")
public class BoardController {

  private final BoardService boardService;
  private final ThreadService threadService;

  public BoardController(BoardService boardService, ThreadService threadService) {
    this.boardService = boardService;
    this.threadService = threadService;
  }

  @GetMapping("/{id}")
  public String index(
      Model model, @PathVariable Long id, @RequestParam Instant before) {
    Board board = boardService.findById(id).orElse(new Board());
    List<Thread> threads =
        threadService.findTenThreads(board.getId(), before != null ? before : Instant.now());
    model.addAttribute("board", board);
    model.addAttribute("threads", threads);
    return "board";
  }
}
