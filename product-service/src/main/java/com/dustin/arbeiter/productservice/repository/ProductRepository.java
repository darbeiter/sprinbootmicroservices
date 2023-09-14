package com.dustin.arbeiter.productservice.repository;

import com.dustin.arbeiter.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
