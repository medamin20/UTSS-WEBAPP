package tn.utss.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import tn.utss.model.SubCategory;

public interface SubCategoryRepository extends MongoRepository<SubCategory, Long> {

}
