package com.ltts.shoppingcart.products.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.shoppingcart.products.domain.ProductRanking;
import com.ltts.shoppingcart.products.repo.ProductRankingRepository;
import com.ltts.shoppingcart.products.service.ProductRankingService;

@Service
public class ProductRankingServiceImpl implements ProductRankingService {
	
	private final ProductRankingRepository productRankingRepository;
	
	@Autowired
	public ProductRankingServiceImpl(ProductRankingRepository productRankingRepository) {
		this.productRankingRepository = productRankingRepository;
	}

	@Override
	public Optional<ProductRanking> findProductRankingById(String asin) {
		
		return productRankingRepository.findProductRankingById(asin);
	}

	@Override
	public List<ProductRanking> getProductsByCategory(String category, int limit, int offset) {
		
		return productRankingRepository.getProductsByCategory(category, limit, offset);
	}

}
