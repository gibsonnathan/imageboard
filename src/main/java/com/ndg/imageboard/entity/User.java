package com.ndg.imageboard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "users")
@Data
public class User {

  @Id private long id;
  private String username;
  private String email;
  private String passwordHash;
}
