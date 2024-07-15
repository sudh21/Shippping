package com.products.services;

import com.products.entites.Products;

import java.util.List;

public interface ProductsServices {

    //create
    Products create(Products products);

    //getall
    List<Products> getAll();

    //getSingle
    Products get(String id);


}
