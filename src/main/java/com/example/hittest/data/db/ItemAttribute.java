package com.example.hittest.data.db;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "item_attribute")
public class ItemAttribute {
    /*
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `name` varchar(255) DEFAULT NULL,
    `description` varchar(255) DEFAULT NULL,
     */
    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Setter
    @Getter
    private String name;
    @Setter
    @Getter
    private String description;

    @OneToMany(mappedBy = "itemAttribute")
    Set<ItemItemAttribute> itemItemAttributeSet;


    public ItemAttribute() {

    }

}
