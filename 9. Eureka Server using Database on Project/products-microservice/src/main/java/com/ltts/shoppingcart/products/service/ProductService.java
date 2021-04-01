package com.ltts.shoppingcart.products.service;

import java.util.List;
import java.util.Optional;

import com.ltts.shoppingcart.products.domain.*;

public interface ProductService {

    Optional<ProductMetadata> findById(String id);

    List<ProductMetadata> findAllProductsPageable(int limit, int offset);

}
