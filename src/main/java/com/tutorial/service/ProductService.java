package com.tutorial.service;

import com.tutorial.repository.ProductRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {

  @Getter
  ProductRepository productRepository;

  String name;

  @Autowired
  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public ProductService(ProductRepository productRepository, String name) {
    this.productRepository = productRepository;
    this.name = name;
  }
}
