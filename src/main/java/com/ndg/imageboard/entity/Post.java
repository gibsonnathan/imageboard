package com.ndg.imageboard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Post {

    @Id
    private int id;
    private int threadId;
    private int userId;
    private String content;
}
