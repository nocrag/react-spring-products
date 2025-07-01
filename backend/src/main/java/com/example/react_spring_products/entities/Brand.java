package com.example.react_spring_products.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
@Entity
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Title is required and cannot be empty.")
    private String title;

}
