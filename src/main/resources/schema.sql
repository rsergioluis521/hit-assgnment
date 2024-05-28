CREATE DATABASE IF NOT EXISTS `warehouse` USE `warehouse`; /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

-- Dumping structure for table warehouse.item
CREATE TABLE IF NOT EXISTS `item` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `sku` varchar(50) DEFAULT NULL,
    `description` varchar(255) DEFAULT NULL,
    `external_product_number` varchar(50) DEFAULT NULL,
    `external_reference_sku` varchar(15) DEFAULT NULL,
    `available` decimal(10,2) DEFAULT NULL,
    PRIMARY KEY (`id`)
    );

INSERT INTO `item` (`id`, `sku`, `description`, `external_product_number`, `external_reference_sku`, `available`) VALUES
                                                                                                                      (1, 'SHIRTREDS', 'Red shirt, small', '2000', '2000REDAS', NULL),
                                                                                                                      (2, 'REDCAP', 'Red cap', '1035', '1035RED', NULL),
                                                                                                                      (3, 'SHIRTREDL', 'Red shirt, large', '2000', '2000REDL', NULL);

CREATE TABLE IF NOT EXISTS `item_attribute` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `name` varchar(255) DEFAULT NULL,
    `description` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
    );

INSERT INTO `item_attribute` (`id`, `name`, `description`) VALUES
                                                               (1, 'color', NULL),
                                                               (2, 'size', NULL),
                                                               (3, 'material', NULL);

CREATE TABLE IF NOT EXISTS `item_item_atribute` (
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

INSERT INTO `item_item_atribute` (`id`, `item_id`, `item_attribute_id`, `value`) VALUES
                                                                                     (1, 1, 1, 'RED'),
                                                                                     (2, 1, 2, 'S');