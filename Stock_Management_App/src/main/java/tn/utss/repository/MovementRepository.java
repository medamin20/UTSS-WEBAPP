package tn.utss.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import tn.utss.model.Movement;

public interface MovementRepository extends MongoRepository<Movement, Long> {

}
