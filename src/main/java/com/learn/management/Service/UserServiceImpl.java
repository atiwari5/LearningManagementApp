/**
 * 
 */
package com.learn.management.Service;

import java.util.List;

import com.learn.management.dto.User;
import com.learn.management.repository.UserRepository;



/**
 * @author Amit Tiwari
 *
 */
public class UserServiceImpl implements  UserService {

	private UserRepository userRepository; 
	
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.getAllUsers();
	}

	@Override
	public User getUser(String id) {
		// TODO Auto-generated method stub
		return userRepository.getUser(id);
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userRepository.addUser(user);
	}

	@Override
	public User UpdateUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.UpdateUser(user);
		
	}

	@Override
	public User DeleteUser(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
