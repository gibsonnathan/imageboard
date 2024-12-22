package com.ndg.imageboard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "boards")
@Data
public class Board {

  @Id private long id;
  private String name;
  private String description;
}
