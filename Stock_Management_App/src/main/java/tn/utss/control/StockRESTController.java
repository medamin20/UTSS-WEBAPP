package tn.utss.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.utss.model.Stock;
import tn.utss.service.StockServiceImpl;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/utss/tn")
public class StockRESTController {

	@Autowired
	StockServiceImpl serviceStock;

	@GetMapping("/AllStocks")
	public List<Stock> getAllStocks() {
		List<Stock> list = serviceStock.retrieveAllStocks();
		return list;
	}

	@GetMapping("/OneStock/{idStock}")
	@ResponseBody
	public Stock getOneStock(@PathVariable("idStock") long idStock) {

		return serviceStock.retrieveStock(idStock);

	}

	@PostMapping(value = "/addStock")
	public Stock addStock(@RequestBody Stock Stock) {
		serviceStock.addStock(Stock);
		return Stock;

	}

	@PutMapping(value = "/updateStock/{id}")
	public Stock updateStock(@PathVariable long id, @RequestBody Stock Stock) {
		return serviceStock.updateStock(id,Stock);

	}

	@DeleteMapping(value = "/deleteStock/{idStock}")
	public void deleteStock(@PathVariable("idStock") long idStock) {
		serviceStock.deleteStock(idStock);
	}
}
