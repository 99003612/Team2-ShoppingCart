package com.ltts.shoppingcart.checkout.repositories;

import java.util.Optional;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.ltts.shoppingcart.checkout.domain.ProductInventory;

public interface ProductInventoryRepository extends CassandraRepository<ProductInventory, String> {
	Optional<ProductInventory> findById(String id);
}
