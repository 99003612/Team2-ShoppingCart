package com.ltts.shoppingcart.products.service;

import java.util.List;
import java.util.Optional;

import com.ltts.shoppingcart.products.domain.ProductRanking;

public interface ProductRankingService {

	Optional<ProductRanking> findProductRankingById(String asin);
	
	List<ProductRanking> getProductsByCategory(String category, int limit, int offset);
	
}
