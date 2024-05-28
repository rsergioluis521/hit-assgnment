package com.example.hittest.data.db;

import javax.persistence.*;

@Entity
@Table(name = "item_item_attribute")
public class ItemItemAttribute {
    /*
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `item_id` int(11) DEFAULT NULL,
    `item_attribute_id` int(11) DEFAULT NULL,
    `value` varchar(50) DEFAULT NULL,
    PRIMARY KEY (`id`),
    KEY `item_item_atribute_item_id_fk` (`item_id`),
    KEY `item_item_atribute_item_attribute_id_fk` (`item_attribute_id`),
    CONSTRAINT `item_item_atribute_item_attribute_id_fk` FOREIGN KEY (`item_attribute_id`) REFERENCES `item_attribute` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT `item_item_atribute_item_id_fk` FOREIGN KEY (`item_id`) REFERENCES `item` (`id`) ON DELETE CASCADE
    );
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @MapsId("id")
    Item item;

    @ManyToOne
    @MapsId("id")
    Item itemAttribute;

    String value;

    public ItemItemAttribute(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Item getItemAttribute() {
        return itemAttribute;
    }

    public void setItemAttribute(Item itemAttribute) {
        this.itemAttribute = itemAttribute;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
