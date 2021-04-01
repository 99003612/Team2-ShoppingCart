package com.ltts.shoppingcart.checkout.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ltts.shoppingcart.checkout.domain.ProductInventory;

public interface ProductInventoryRepo extends CrudRepository<ProductInventory, String> {

}
