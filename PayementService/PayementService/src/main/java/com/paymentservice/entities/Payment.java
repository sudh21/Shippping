package com.paymentservice.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Document("payment_process")
public class Payment {

    @Id
    private String paymentId;
    private   int amount;
    private String userId;
    private String productId;
    private  String  productName;

}
