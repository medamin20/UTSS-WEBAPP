package tn.utss.service;

import java.util.List;

import tn.utss.model.Movement;


public interface MovementService {

	// ===== CRUD =====//
	List<Movement> retrieveAllMovements();

	Movement retrieveMovement(long idMovement);

	Movement addMovement(Movement m);

	Movement updateMovement(Movement m);

	void deleteMovement(long idMovement);
	// ===== CRUD =====//

	Movement supplyReception(Movement mov,  long idStock);

	

	
}
