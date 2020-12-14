package com.example.demo.user;

import java.util.List;
import java.util.Optional;



public interface UserService {
	
	
	public List<User> getAllUser();
	public Optional<User> getUser(int id);
	public User saveUser(User user);
	public  User updateUser(User user);
	public  void deleteUser(int id);

}
