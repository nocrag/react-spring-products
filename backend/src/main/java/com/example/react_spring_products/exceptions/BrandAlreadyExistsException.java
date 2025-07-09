package com.example.react_spring_products.exceptions;

public class BrandAlreadyExistsException extends ApiException {
    public BrandAlreadyExistsException() {
        super("Brand already exists", 400);
    }
}
