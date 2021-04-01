package com.ltts.shoppingcart.products.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.shoppingcart.products.domain.ProductMetadata;
import com.ltts.shoppingcart.products.repo.ProductMetadataRepo;
import com.ltts.shoppingcart.products.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductMetadataRepo productRepository;

    @Autowired
    public ProductServiceImpl(ProductMetadataRepo productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Optional<ProductMetadata> findById(String id) {
        return productRepository.findById(id);
    }

	@Override
	public List<ProductMetadata> findAllProductsPageable(int limit, int offset) {
		
		return productRepository.getProducts(limit, offset);
	}
}
