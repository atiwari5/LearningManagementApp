/**
 * 
 */
package com.learn.management.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.learn.management.dto.User;

/**
 * @author Amit Tiwari
 *
 */
@Repository
public class UserRepository {
	
	List<User> userList = new ArrayList<>(); 

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userList;
	}

	public User getUser(String id) {
		
		Optional<User> first = userList.stream()
										.filter(u -> u.getId()
										.equals(id))
										.findFirst();
		
		if (first.isPresent()) 
			{return first.get() ;}
		else 
			{ return new User() ;}
		
	}

	public void addUser(User user) {
		// TODO Auto-generated method stub
		userList.add(user);
	}

	public User UpdateUser(User user) {
		for (User ul : userList) {
			if(ul.getId().equals(user.getId())) {
				ul.setName(user.getName());
				ul.setAddress(user.getAddress());
				return user;
			}}
			
			return new User() ;		
	}

	public User DeleteUser(String id) {

		Optional<User> first = userList.stream()
										.filter(u -> u.getId()
										.equals(id))
										.findFirst();
		
		if (first.isPresent()) 
			{
			User user = first.get();
			userList.remove(user);
			return user;}
		else 
			{ return new User() ;}
		
	}


	
	
}
