package com.ndg.imageboard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Image {

    @Id
    private int id;
    private int postId;
    private String imageUrl;

}
