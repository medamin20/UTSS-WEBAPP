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

import tn.utss.model.Category;
import tn.utss.service.CategoryServiceImpl;

@RestController
@RequestMapping("/utss/tn")
public class CategoryRESTController {

	@Autowired
	CategoryServiceImpl serviceCategory;

	@GetMapping("/AllCategories")
	public List<Category> getAllCategories() {
		List<Category> list = serviceCategory.retrieveAllCategories();
		return list;
	}

	@GetMapping("/OneCategory/{idCategory}")
	@ResponseBody
	public Category getOneCategory(@PathVariable("idCategory") long idCategory) {

		return serviceCategory.retrieveCategory(idCategory);

	}

	@PostMapping(value = "/addCategory")
	public Category addCategory(@RequestBody Category category) {
		serviceCategory.addCategory(category);
		return category;

	}

	@PutMapping(value = "/updateCategory")
	public Category updateCategory(@RequestBody Category category) {
		return serviceCategory.updateCategory(category);

	}

	@DeleteMapping(value = "/deleteCategory/{idCategory}")
	public void deleteCategory(@PathVariable("idCategory") long idCategory) {
		serviceCategory.deleteCategory(idCategory);
	}
}
