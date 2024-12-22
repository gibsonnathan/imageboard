package com.ndg.imageboard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Thread {

    @Id
    private int id;
    private int boardId;
    private String title;
    private String content;
}
