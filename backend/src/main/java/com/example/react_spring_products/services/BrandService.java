package com.example.react_spring_products.services;

import com.example.react_spring_products.entities.Brand;
import com.example.react_spring_products.repositories.BrandRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {

    private final BrandRepository brandRepository;

    public BrandService(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    public Brand createBrand(Brand brand) {
        return brandRepository.save(brand);
    }
}
