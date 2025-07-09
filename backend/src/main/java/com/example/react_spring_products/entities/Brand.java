package com.example.react_spring_products.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    @NotBlank(message = "Brand name is required")
    @Size(min = 2, max = 50, message = "Brand name must be between 2 and 50 characters")
    private String name;

    public Brand(String name
    ) {
        this.name = name;
    }

    public Brand() {}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
