package tn.utss.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import tn.utss.model.Category;

public interface CategoryRepository extends MongoRepository<Category, Long> {

}
