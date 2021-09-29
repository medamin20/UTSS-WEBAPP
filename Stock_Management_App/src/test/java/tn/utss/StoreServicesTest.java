package tn.utss;

import java.text.ParseException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.utss.model.Localisation;
import tn.utss.model.Store;
import tn.utss.repository.StoreRepository;
import tn.utss.service.StoreService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StoreServicesTest {

	@Autowired
	StoreService storeService;

	@Autowired
	StoreRepository storeRepository;

	@Test
	public void testAddStore() throws ParseException {
		Store s1 = new Store(1, "Kef", "Kef");
		Store s2 = new Store(2, "Nabeul", "Nabeul");
		Store s3 = new Store(3, "Gafsa", "Gafsa");
		storeService.addStore(s1);
		storeService.addStore(s2);
		storeService.addStore(s3);
	}

	@Test
	public void testUpdateStore() throws ParseException {
		Store s = storeRepository.findById(Long.parseLong("1")).get();
		s.setNameStore("new");
		storeService.updateStore(s);
	}

	@Test
	public void testDeleteStore() throws ParseException {
		storeService.deleteStore(3);
	}

	@Test
	public void testRetrieveAllStore() throws ParseException {
		storeService.retrieveAllStores();
	}

	@Test
	public void testRetrieveStore() throws ParseException {
		Store p = storeRepository.findById(Long.parseLong("1")).get();
		storeService.retrieveStore(1).getClass();
	}

}
