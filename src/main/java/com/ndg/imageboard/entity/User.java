package com.ndg.imageboard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.Instant;

@Entity(name = "users")
@Data
public class User {

  @Id private long id;
  private String username;
  private String email;
  private String passwordHash;
  @CreatedDate
  private Instant createdAt;
  @LastModifiedDate
  private Instant modifiedAt;
}
