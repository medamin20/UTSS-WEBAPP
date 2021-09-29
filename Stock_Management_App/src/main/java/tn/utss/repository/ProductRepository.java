package tn.utss.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import tn.utss.model.Product;

public interface ProductRepository extends MongoRepository<Product, Long> {

}
