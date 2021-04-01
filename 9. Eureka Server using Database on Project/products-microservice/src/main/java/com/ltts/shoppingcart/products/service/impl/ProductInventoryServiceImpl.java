package com.ltts.shoppingcart.products.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.shoppingcart.products.domain.ProductInventory;
import com.ltts.shoppingcart.products.repo.ProductInventoryRepository;
import com.ltts.shoppingcart.products.service.ProductInventoryService;

@Service
public class ProductInventoryServiceImpl implements ProductInventoryService {

    private final ProductInventoryRepository productInventoryRepository;

    @Autowired
    public ProductInventoryServiceImpl(ProductInventoryRepository productInventoryRepository) {
        this.productInventoryRepository = productInventoryRepository;
    }

    @Override
    public Optional<ProductInventory> findById(String id) {
        return productInventoryRepository.findById(id);
    }
}
