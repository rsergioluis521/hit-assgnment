package com.example.hittest.service;

import com.example.hittest.data.models.ProductInventory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import soapClient.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class SoapClientService {
    private final InventoryService inventoryService;

    public SoapClientService(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    public List<ProductInventory> getInventory(String productId) {
        GetInventoryLevelsRequest request = getGetInventoryLevelsRequest(productId);

        GetInventoryLevelsResponse response = inventoryService.getInventoryLevels(request);

        if (response.getServiceMessageArray() != null &&
                !response.getServiceMessageArray().getServiceMessage().isEmpty()) {
            throw new RuntimeException("GetInventoryLevels failed. Error: " + response.getServiceMessageArray().getServiceMessage());
        }
        if (response.getInventory() != null &&
                response.getInventory().getPartInventoryArray() != null &&
                response.getInventory().getPartInventoryArray().getPartInventory().isEmpty()) {
            throw new RuntimeException("Error no inventory found for productId " + productId);
        }

        return getProductInventories(productId, response);
    }

    private static List<ProductInventory> getProductInventories(String productId, GetInventoryLevelsResponse response) {
        List<ProductInventory> inventories = new ArrayList<>();
        for (PartInventoryArray.PartInventory partInventory : response.getInventory().getPartInventoryArray().getPartInventory()) {
            ProductInventory productInventory = new ProductInventory();
            productInventory.setProductId(productId);
            productInventory.setSku(partInventory.getPartId());
            productInventory.setQuantity(partInventory.getQuantityAvailable().getQuantity().getValue().intValue());

            inventories.add(productInventory);
        }
        return inventories;
    }

    private GetInventoryLevelsRequest getGetInventoryLevelsRequest(String productId) {
        GetInventoryLevelsRequest request = new GetInventoryLevelsRequest();
        request.setWsVersion("2.0.0");
        request.setProductId(productId);
        request.setId("amanzonii");
        request.setPassword("i2r09jnacuiah2phrunucasjoaschias");
        return request;
    }
}
