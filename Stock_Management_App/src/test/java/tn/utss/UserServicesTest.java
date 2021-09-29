package tn.utss;

import java.text.ParseException;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.utss.model.User;
import tn.utss.repository.UserRepository;
import tn.utss.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServicesTest {

	@Autowired
	UserService userService;

	@Autowired
	UserRepository userRepository;

	@Test
	public void testAddUser() throws ParseException {

		Date date1 = new Date(2021 - 01 - 01);
		Date date2 = new Date(2021 - 01 - 02);
		Date date3 = new Date(2021 - 01 - 03);

		User u1 = new User("Mihoubi", "Oussema", 12345678, date1, "abc123", "abc123", "+21650123456", true,
				"oussema@esprit.tn");
		User u2 = new User("Houissa", "Ghassen", 87654321, date2, "def456", "def456", "+21650123456", true,
				"ghassen@esprit.tn");
		User u3 = new User("Hammadi", "Moneim", 12341234, date3, "ghi789", "ghi789", "+21650123456", true,
				"moneim@esprit.tn");
//		userService.addUser(u1);
//		userService.addUser(u2);
		userService.addUser(u3);
	}

	@Test
	public void testUpdateUser() throws ParseException {
		User u = userRepository.findById(Long.parseLong("1")).get();
		u.setEmail("oussemamihoubi@esprit.tn");
		userService.updateUser(u);
	}

	@Test
	public void testDeleteUser() throws ParseException {
		userService.deleteUser(3);
	}

	@Test
	public void testRetrieveAllUser() throws ParseException {
		userService.retrieveAllUsers();
	}

	@Test
	public void testRetrieveUser() throws ParseException {
		User u = userRepository.findById(Long.parseLong("1")).get();
		userService.retrieveUser(1).getClass();
	}

}
