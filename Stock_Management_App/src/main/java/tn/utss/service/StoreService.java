package tn.utss.service;

import java.util.List;

import tn.utss.model.Stock;
import tn.utss.model.Store;

public interface StoreService {

	// ===== CRUD =====//

	List<Store> retrieveAllStores();

	Store retrieveStore(long idStore);

	Store addStore(Store sre);

	Store updateStore(Store sre);

	void deleteStore(long idStore);

	// ===== CRUD =====//
}
