/**
 * 
 */
package com.learn.management.Service;

import java.util.List;

import com.learn.management.dto.User;

/**
 * @author Amit Tiwari
 *
 */
public interface UserService {

	public List<User> getAllUsers();

	public User getUser(String id);

	public void addUser(User user);

	public User UpdateUser(User user);

	public User DeleteUser(String id);

}
