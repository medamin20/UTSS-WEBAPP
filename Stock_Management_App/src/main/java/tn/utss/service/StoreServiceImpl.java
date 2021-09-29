package tn.utss.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.utss.model.Stock;
import tn.utss.model.Store;
import tn.utss.repository.StockRepository;
import tn.utss.repository.StoreRepository;

@Service
public class StoreServiceImpl implements StoreService {

	@Autowired
	StoreRepository storeRepository;
	
	@Autowired
	StockRepository stockRepository;
	
	@Autowired
	StockServiceImpl stockServiceImpl;
	
	@Autowired
	SequenceGeneratorService sequenceGeneratorService;

	private static final Logger L = LogManager.getLogger(StoreServiceImpl.class);

	@Override
	public List<Store> retrieveAllStores() {
		return storeRepository.findAll();
	}

	@Override
	public Store retrieveStore(long idStore) {
		Store Store = storeRepository.findById(idStore).get();
		L.info("Store returned +++ :" + Store);
		return Store;
	}

	@Override
	public Store addStore(Store s) {
		s.setIdStore(sequenceGeneratorService.generateSequence(Store.SEQUENCE_NAME));
		storeRepository.save(s);
		
		Stock st = new Stock();
		st.setIdStock(sequenceGeneratorService.generateSequence(Stock.SEQUENCE_NAME));
		stockRepository.save(st);
		s.setStock(st);
		return storeRepository.save(s);
	}

	@Override
	public Store updateStore(Store c) {
		return storeRepository.save(c);
	}

	@Override
	public void deleteStore(long idStore) {
		storeRepository.deleteById(idStore);

	}
}
