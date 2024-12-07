package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

/**
 * @Auther: willson2008
 * @Date: 07/12/2024 - 12 - 07 - 12:03
 * @Description: com.example.demo
 * @Version: 1.0
 */
@Entity
public class Task {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;

    // Getters and Setters
}
