package com.example.react_spring_products.services;

import com.example.react_spring_products.entities.Brand;
import com.example.react_spring_products.exceptions.BrandAlreadyExistsException;
import com.example.react_spring_products.repositories.BrandRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrandService {

    private final BrandRepository brandRepository;

    public BrandService(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    public Brand createBrand(Brand brand) {

        if (brand.getName() == null || brand.getName().isBlank()) {
            throw new IllegalArgumentException("Brand name is required");
        }

        String normalizedName = brand.getName().toLowerCase();

        if (brandRepository.findByName(normalizedName).isPresent()) {
            throw new BrandAlreadyExistsException();
        }

        brand.setName(normalizedName);
        return brandRepository.save(brand);
    }
}
