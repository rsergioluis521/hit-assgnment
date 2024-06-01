package com.example.hittest.service;

import com.example.hittest.data.models.ProductInventory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import soapClient.InventoryServiceV2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class SoapClientServiceTest {
    private SoapClientService soapClientService;

    @BeforeEach
    void setUp() {
        soapClientService = new SoapClientService(new InventoryServiceV2().getInventoryServiceBinding());
    }

    @Test
    void getInventory() {
        List<ProductInventory> productInventories = soapClientService.getInventory("2000", Collections.singletonList("2000REDL"));
        assertFalse(productInventories.isEmpty());
    }
}