package com.ndg.imageboard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "threads")
@Data
public class Thread {

  @Id private long id;
  private long boardId;
  private String title;
  private String content;
}
