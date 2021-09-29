package tn.utss.service;

import java.util.List;

import tn.utss.model.Stock;

public interface StockService {

	// ===== CRUD =====//

	List<Stock> retrieveAllStocks();

	Stock retrieveStock(long idStock);

	Stock addStock(Stock sck);

	Stock updateStock(long id,Stock sck);

	void deleteStock(long idStock);

	// ===== CRUD =====//
}
