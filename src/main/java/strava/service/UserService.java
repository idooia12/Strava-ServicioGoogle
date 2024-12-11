package strava.service;

import java.util.List;
import java.util.Optional;

import strava.dao.UserRepository;
import strava.entity.User;

public class UserService {
	private UserRepository userRepository;
	
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User getUser(String email) {
    	
		Optional<User> result = userRepository.findByEmail(email);
		
		return result.isEmpty() ? null : result.get();
    }	
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    
    public void deleteUser(String email) {
    	Optional<User> result= userRepository.findByEmail(email);
        userRepository.delete(result.get());
    }
    
    public void createUpdateUser(User user) {
        userRepository.save(user);
    }
}
