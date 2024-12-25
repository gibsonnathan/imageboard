package com.ndg.imageboard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.Instant;

@Entity(name = "threads")
@Data
public class Thread {

  @Id private long id;
  private long boardId;
  private String title;
  private String content;
  @CreatedDate
  private Instant createdAt;
  @LastModifiedDate
  private Instant modifiedAt;
}
