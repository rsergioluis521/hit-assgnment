package com.example.hittest.data.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Indexed;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Indexed
@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
    Optional<Item> findItemByExternalProductNumberAndSku(String externalProductNumber, String sku);
}
