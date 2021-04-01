package com.ltts.shoppingcart.checkout.rest.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ltts.shoppingcart.checkout.domain.ProductMetadata;
import com.ltts.shoppingcart.checkout.domain.ProductRanking;

@FeignClient("products-microservice")
@RequestMapping("/products-microservice")
public interface ProductCatalogRestClient {
  
  @RequestMapping("/product/{asin}")
  ProductMetadata getProductDetails(@PathVariable("asin") String asin);
  
  @RequestMapping("/products")
  List<ProductMetadata> getProducts(@RequestParam("limit") int limit, @RequestParam("offset") int offset);

  @RequestMapping("/products/category/{category}")
  List<ProductRanking> getProductsByCategory(@PathVariable("category") String category,
                                              @RequestParam("limit") int limit,
                                              @RequestParam("offset") int offset);
}
