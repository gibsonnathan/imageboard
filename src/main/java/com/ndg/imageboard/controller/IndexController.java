package com.ndg.imageboard.controller;

import com.ndg.imageboard.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

  private final BoardService boardService;
  private final ImageService imageService;
  private final PostService postService;
  private final ThreadService threadService;
  private final UserService userService;

  public IndexController(
      BoardService boardService,
      ImageService imageService,
      PostService postService,
      ThreadService threadService,
      UserService userService) {
    this.boardService = boardService;
    this.imageService = imageService;
    this.postService = postService;
    this.threadService = threadService;
    this.userService = userService;
  }

  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("boards", boardService.findAll());
    return "index";
  }
}
