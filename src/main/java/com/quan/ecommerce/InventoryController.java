package com.quan.ecommerce;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {

    @GetMapping("/inventory")
    public boolean inventory(
         @RequestParam(value = "orderNumber") String orderNumber // Binds the 'orderNumber' parameter
    ) {
        if (orderNumber.startsWith("N")) {
            // Inventory not available for order
            return false;
        }

        return true; // Inventory available for order
    }
}