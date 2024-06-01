package com.example.hittest.data.models;

import lombok.Data;

@Data
public class ItemNetwork {
    private String sku;
    private String description;
    private String externalProductNumber;
    private String externalReferenceSku;
    private int available;
}
