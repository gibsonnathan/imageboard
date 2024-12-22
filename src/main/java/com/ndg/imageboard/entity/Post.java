package com.ndg.imageboard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "posts")
@Data
public class Post {

  @Id private long id;
  private long threadId;
  private long userId;
  private String content;
}
