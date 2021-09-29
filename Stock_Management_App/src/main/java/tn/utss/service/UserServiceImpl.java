package tn.utss.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.utss.model.User;
import tn.utss.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	SequenceGeneratorService sequenceGeneratorService;
	
	

	private static final Logger L = LogManager.getLogger(UserServiceImpl.class);

	@Override
	public List<User> retrieveAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User retrieveUser(long idUser) {
		User User = userRepository.findById(idUser).get();
		L.info("User returned +++ :" + User);
		return User;
	}

	@Override
	public User addUser(User u) {
		u.setId(sequenceGeneratorService.generateSequence(User.SEQUENCE_NAME));
		return userRepository.save(u);
	}

	@Override
	public User updateUser(User u) {
		return userRepository.save(u);
	}

	@Override
	public void deleteUser(long idUser) {
		userRepository.deleteById(idUser);

	}

}
