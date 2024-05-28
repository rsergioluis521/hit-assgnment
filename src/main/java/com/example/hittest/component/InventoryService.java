package com.example.hittest.component;

import com.example.hittest.data.db.Item;
import com.example.hittest.data.db.ItemRepository;
import com.example.hittest.data.models.ItemNetwork;
import com.example.hittest.data.models.ProductInventory;
import com.example.hittest.service.SoapClientService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class InventoryService {
    private final ItemRepository itemRepository;
    private final SoapClientService soapClientService;

    public void saveItem(ItemNetwork itemNetwork) {
        Item item = new Item();
        item.setSku(item.getSku());
        item.setDescription(item.getDescription());

        itemRepository.save(item);
    }

    public InventoryService(ItemRepository itemRepository, SoapClientService soapClientService){
        this.itemRepository = itemRepository;
        this.soapClientService = soapClientService;
    }


    @Scheduled(cron = "0 0 * * * *") //Run every hour
    public void updateInventory(){
        List<Item> items = itemRepository.findAll();
        for(Item item : items){
            updateInventory(item.getExternalProductNumber());
        }
    }

    private void updateInventory(String productId){
        try {
            List<ProductInventory> inventories = soapClientService.getInventory(productId);
            for(ProductInventory inventory : inventories){
                updateInventoryOnDatabase(inventory);
            }
        } catch (Exception exception) {
            // log exception
            exception.printStackTrace();
        }
    }

    private void updateInventoryOnDatabase(ProductInventory inventory){
        try {
            Item item = itemRepository.findItemByExternalProductNumberAndSku(inventory.getProductId(), inventory.getSku())
                    .orElseThrow(() -> new RuntimeException("Item not found product id " + inventory.getProductId() +
                            " sku " + inventory.getSku()));
            item.setAvailable(BigDecimal.valueOf(inventory.getQuantity()));
        } catch (Exception exception) {
            // log exception
            exception.printStackTrace();
        }
    }
}
