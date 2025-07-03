package com.example.react_spring_products.repositories;

import com.example.react_spring_products.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Long> {

}
