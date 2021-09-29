package tn.utss.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import tn.utss.model.Stock;


@Repository
public interface StockRepository extends MongoRepository<Stock, Long> {

}
