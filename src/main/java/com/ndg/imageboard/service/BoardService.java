package com.ndg.imageboard.service;

import com.ndg.imageboard.entity.Board;
import com.ndg.imageboard.repository.BoardRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public List<Board> findAll() {
        return boardRepository.findAll();
    }
}
