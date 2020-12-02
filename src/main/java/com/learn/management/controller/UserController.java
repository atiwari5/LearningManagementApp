/**
 * 
 */
package com.learn.management.controller;

import com.learn.management.Service.UserService;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.learn.management.dto.User ;

/**
 * @author Amit Tiwari
 *
 */
public class UserController {
	
	@Autowired
	private UserService userService ;
	
	@GetMapping("/users")
	public List<User> getAllUSers(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/user/(id)")
	public User getUser(@PathVariable String id){
		return userService.getUser(id);
	}
	
	@PostMapping("/user")
	public ResponseEntity<Object> addUser(@RequestBody User user){
		userService.addUser(user);
		URI path = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/(id)")
				.buildAndExpand(user.getId())
				.toUri();
		
		return ResponseEntity.created(path).build();
	}
	
	@PutMapping("/user")
	public User UpdateUser(@RequestBody User user){
		return userService.UpdateUser(user);
	}
	
	@DeleteMapping("user/id")
	public User DeleteUser(@PathVariable String id) {
		return userService.DeleteUser(id);
	}
	
	
}
