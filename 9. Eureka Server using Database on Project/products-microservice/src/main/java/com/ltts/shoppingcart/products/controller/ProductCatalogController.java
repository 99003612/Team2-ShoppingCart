package com.ltts.shoppingcart.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.shoppingcart.products.domain.ProductMetadata;
import com.ltts.shoppingcart.products.domain.ProductRanking;
import com.ltts.shoppingcart.products.service.ProductRankingService;
import com.ltts.shoppingcart.products.service.ProductService;

@RestController
@RequestMapping(value = "/products-microservice")
public class ProductCatalogController {
  
  // This service is used to lookup metadata of products by their id.
  @Autowired
  ProductService productService;

  // This service is used to lookup the top products by sales rank in a category.
  @Autowired
  ProductRankingService productRankingService;
  
  @RequestMapping(method = RequestMethod.GET, value = "/product/{asin}", produces = "application/json")
  public ProductMetadata getProductDetails(@PathVariable String asin) {
    ProductMetadata productMetadata = productService.findById(asin).get();
    return productMetadata;
  }  

  @RequestMapping(method = RequestMethod.GET, value = "/products", produces = "application/json")
  public List<ProductMetadata> getProducts(@Param("limit") int limit, @Param("offset") int offset) {
    return productService.findAllProductsPageable(limit, offset);
  }  

  @RequestMapping(method = RequestMethod.GET, value = "/products/category/{category}", produces = "application/json")
  public List<ProductRanking> getProductsByCategory(@PathVariable String category,
                                                    @Param("limit") int limit,
                                                    @Param("offset") int offset) {
    return productRankingService.getProductsByCategory(category, limit, offset);
  }  
}
