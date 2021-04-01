package com.ltts.shoppingcart.products.service;

import java.util.Optional;

import com.ltts.shoppingcart.products.domain.*;

public interface ProductInventoryService {

    Optional<ProductInventory> findById(String id);

}
