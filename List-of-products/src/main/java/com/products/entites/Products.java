package com.products.entites;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Document(collection = "products")
public class Products {

    @Id
    private String product_id;
    private String product_name;
    private String product_prize;
    private String product_about;
    private String product_review;
}
