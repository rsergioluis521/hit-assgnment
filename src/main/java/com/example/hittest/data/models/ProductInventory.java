package com.example.hittest.data.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductInventory {
    private String productId;
    private String sku;
    private int quantity;
}
