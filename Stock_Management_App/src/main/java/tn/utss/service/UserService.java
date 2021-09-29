package tn.utss.service;

import java.util.List;

import tn.utss.model.User;

public interface UserService {

	// ===== CRUD =====//

	List<User> retrieveAllUsers();

	User retrieveUser(long idUser);

	User addUser(User u);

	User updateUser(User u);

	void deleteUser(long idUser);

	// ===== CRUD =====//
}
