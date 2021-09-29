package tn.utss.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.utss.model.Store;
import tn.utss.service.StoreServiceImpl;

@RestController
@RequestMapping("/utss/tn")
public class StoreRESTController {
	
	@Autowired
	StoreServiceImpl serviceStore;

	@GetMapping("/AllStores")
	public List<Store> getAllStores() {
		List<Store> list = serviceStore.retrieveAllStores();
		return list;
	}

	@GetMapping("/OneStore/{idStore}")
	@ResponseBody
	public Store getOneStore(@PathVariable("idStore") long idStore) {

		return serviceStore.retrieveStore(idStore);

	}

	@PostMapping(value = "/addStore")
	public Store addStore(@RequestBody Store Store) {
		serviceStore.addStore(Store);
		return Store;

	}

	@PutMapping(value = "/updateStore")
	public Store updateStore(@RequestBody Store Store) {
		return serviceStore.updateStore(Store);

	}

	@DeleteMapping(value = "/deleteStore/{idStore}")
	public void deleteStore(@PathVariable("idStore") long idStore) {
		serviceStore.deleteStore(idStore);
	}
}
