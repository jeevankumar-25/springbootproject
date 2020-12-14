package com.example.demo.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(path="/users")
	public List<User> getUsers(){
		System.out.print("users");
		return userService.getAllUser();
		}
	
	@GetMapping(path="/user/{id}")
	public Optional<User> getUserById(@PathVariable int id)
	{
		return userService.getUser(id);
	}
	
	@PostMapping(path="/user")
	public User  saveUser(@RequestBody User user)
	{
		
		 return userService.saveUser(user);
		 

	}
	
	@PutMapping("/user")
	public User updateUser(@RequestBody  User user)
	{ 
     
		return userService.updateUser(user);
	}
	
	@DeleteMapping("/user/{id}")
	public void deleteuser(@PathVariable int id)
	{
		
		userService.deleteUser(id);
	}
	

}
