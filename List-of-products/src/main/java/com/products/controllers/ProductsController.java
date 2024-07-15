package com.products.controllers;

import com.products.entites.Products;
import com.products.services.ProductsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/products")
public class ProductsController {
@Autowired
private ProductsServices productsServices;

//Create
    @PostMapping("/create")
public ResponseEntity<Products> createProducts(@RequestBody Products products){

    return ResponseEntity.status(HttpStatus.CREATED).body(productsServices.create(products));

}



@GetMapping("/{product_id}")
public ResponseEntity<Products> createProducts(String product_id){

    return ResponseEntity.status(HttpStatus.OK).body(productsServices.get(product_id));

}

@GetMapping
public  ResponseEntity<List<Products>> getAll(){


        return ResponseEntity.ok(productsServices.getAll());


}

@DeleteMapping("/del/{product_id}")
public ResponseEntity<String> deleteProduct(@PathVariable String product_id){


return new ResponseEntity<String>("Product Deleted",HttpStatus.OK);


}
}