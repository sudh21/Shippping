package com.products.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String productsIsNotFound) {
    }
public ResourceNotFoundException(){


        super("Product is not found");
}


}
