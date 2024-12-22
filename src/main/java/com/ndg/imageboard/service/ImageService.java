package com.ndg.imageboard.service;

import com.ndg.imageboard.repository.ImageRepository;
import org.springframework.stereotype.Service;

@Service
public class ImageService {

    public ImageService(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    private final ImageRepository imageRepository;
}
