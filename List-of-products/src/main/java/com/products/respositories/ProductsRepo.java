package com.products.respositories;

import com.products.entites.Products;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductsRepo extends MongoRepository <Products,String>{



}


