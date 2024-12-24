package com.ndg.imageboard.controller;

import com.ndg.imageboard.entity.Board;
import com.ndg.imageboard.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/boards")
public class BoardController {

  private final BoardService boardService;

  public BoardController(BoardService boardService) {
    this.boardService = boardService;
  }

  @GetMapping("/{id}")
  public String index(Model model, @PathVariable Long id) {
    model.addAttribute("board", boardService.findById(id).orElse(new Board()));
    return "board";
  }
}
