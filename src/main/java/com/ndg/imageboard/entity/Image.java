package com.ndg.imageboard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "images")
@Data
public class Image {

  @Id private long id;
  private long postId;
  private String imageUrl;
}
