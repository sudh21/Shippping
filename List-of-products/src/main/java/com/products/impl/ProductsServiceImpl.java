package com.products.impl;

import com.products.entites.Products;
import com.products.exception.ResourceNotFoundException;
import com.products.respositories.ProductsRepo;
import com.products.services.ProductsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

import static java.util.UUID.randomUUID;

@Service
public class ProductsServiceImpl implements ProductsServices {
@Autowired
private ProductsRepo productsRepo;
    @Override
    public Products create(Products products) {

      String product_id = UUID.randomUUID().toString();
        products.setProduct_id(product_id);
      return productsRepo.save(products);

    }

    @Override
    public List<Products> getAll() {
        return productsRepo.findAll();
    }

    @Override
    public Products get(String id) {
        return productsRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Products is not found "+id));


    }
}
