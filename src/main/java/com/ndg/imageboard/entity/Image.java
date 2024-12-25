package com.ndg.imageboard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.Instant;

@Entity(name = "images")
@Data
public class Image {

  @Id private long id;
  private long postId;
  private String imageUrl;
  @CreatedDate
  private Instant createdAt;
  @LastModifiedDate
  private Instant modifiedAt;
}
