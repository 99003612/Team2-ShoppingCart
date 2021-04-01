package com.ltts.shoppingcart.products.repo;

import java.util.Optional;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.ltts.shoppingcart.products.domain.ProductInventory;

public interface ProductInventoryRepository extends CassandraRepository<ProductInventory, String> {
	Optional<ProductInventory> findById(String id);
}
