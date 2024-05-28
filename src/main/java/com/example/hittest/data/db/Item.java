package com.example.hittest.data.db;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "items")
public class Item {
    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Setter
    @Getter
    private String sku;
    @Setter
    @Getter
    private String description;
    @Setter
    @Getter
    @Column(name = "external_product_number")
    private String externalProductNumber;
    @Setter
    @Getter
    @Column(name = "external_reference_sku")
    private String externalReferenceSku;
    @Setter
    @Getter
    private BigDecimal available;

    @OneToMany(mappedBy = "item")
    Set<ItemItemAttribute> itemItemAttributeSet;

    public Item() {
    }

}
