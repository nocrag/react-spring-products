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
        Optional<Brand> existingBrand = brandRepository.findByName(brand.getName());

        if (existingBrand.isPresent()) {
            throw new BrandAlreadyExistsException();
        }

        return brandRepository.save(brand);
    }
}
