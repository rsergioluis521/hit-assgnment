package com.example.hittest.controller;

import com.example.hittest.component.InventoryService;
import com.example.hittest.data.models.ItemNetwork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
public class ItemController {
   @Autowired
   private InventoryService inventoryService;

    @PostMapping
    public String addItem(@RequestBody ItemNetwork item) {
        try {
            inventoryService.saveItem(item);
            return "Successfully added item";
        } catch (Exception e) {
            return "Error adding item";
        }
    }

    @PutMapping("updateAll")
    public String updateItems() {
        try {
            inventoryService.updateInventory();
            return "Successfully updated inventories";
        } catch (Exception e) {
            return "Error updating inventories";
        }
    }

    @GetMapping("{itemId}")
    public ItemNetwork getItemById(@PathVariable Integer itemId){
        try {
            return inventoryService.getItemById(itemId);
        }catch (Exception ex){
            throw new RuntimeException("Could not find item with id " + itemId);
        }
    }
}

