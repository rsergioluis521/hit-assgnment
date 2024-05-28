package com.example.hittest.data.models;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ItemNetwork {
    private String sku;
    private String description;
    private String externalProductNumber;
    private String externalReferenceSku;
    private BigDecimal available;
}
