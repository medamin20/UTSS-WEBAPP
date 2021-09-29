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

import tn.utss.model.User;
import tn.utss.service.UserServiceImpl;

@RestController
@RequestMapping("/utss/tn")
public class UserRESTController {

	@Autowired
	UserServiceImpl serviceUser;

	@GetMapping("/AllUsers")
	public List<User> getAllUsers() {
		List<User> list = serviceUser.retrieveAllUsers();
		return list;
	}

	@GetMapping("/OneUser/{idUser}")
	@ResponseBody
	public User getOneUser(@PathVariable("idUser") long idUser) {

		return serviceUser.retrieveUser(idUser);

	}

	@PostMapping(value = "/addUser")
	public User addUser(@RequestBody User User) {
		serviceUser.addUser(User);
		return User;

	}

	@PutMapping(value = "/updateUser")
	public User updateUser(@RequestBody User User) {
		return serviceUser.updateUser(User);

	}

	@DeleteMapping(value = "/deleteUser/{idUser}")
	public void deleteUser(@PathVariable("idUser") long idUser) {
		serviceUser.deleteUser(idUser);
	}
}
