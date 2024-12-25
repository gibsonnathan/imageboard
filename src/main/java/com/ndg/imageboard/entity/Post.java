package com.ndg.imageboard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.Instant;

@Entity(name = "posts")
@Data
public class Post {

  @Id private long id;
  private long threadId;
  private long userId;
  private String content;
  @CreatedDate
  private Instant createdAt;
  @LastModifiedDate
  private Instant modifiedAt;
}
