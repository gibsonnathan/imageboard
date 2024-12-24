package com.ndg.imageboard.controller;

import com.ndg.imageboard.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

  private final BoardService boardService;
  private final UserService userService;

  public IndexController(
      BoardService boardService,
      UserService userService) {
    this.boardService = boardService;
    this.userService = userService;
  }

  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("boards", boardService.findAll());
    return "index";
  }
}
