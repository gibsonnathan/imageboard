package com.ndg.imageboard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.Instant;

@Entity(name = "boards")
@Data
public class Board {

  @Id private long id;
  private String name;
  private String description;
  @CreatedDate
  private Instant createdAt;
  @LastModifiedDate
  private Instant modifiedAt;
}
