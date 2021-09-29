package tn.utss.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import tn.utss.model.Store;

public interface StoreRepository extends MongoRepository<Store, Long> {

}
