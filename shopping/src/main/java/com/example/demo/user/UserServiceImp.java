package com.example.demo.user;

  
  
  import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
  
  @Service
  public class UserServiceImp implements UserService {
  
  @Autowired 
  private UserRepository userRep;
  
  List<User> list=new ArrayList<>();
  
  
  
  @Override 
  public List<User> getAllUser() 
  { 
	  System.out.println("get all use");
	  return userRep.findAll();
  }
  
  @Override
  public Optional<User> getUser(int id)
  { 
	  return userRep.findById(id); 
//	  User u = new User();
	  
	 
  }
  
  
  @Override
  public User saveUser(User user)
  {
	 return  userRep.save(user); 
	
  }
  
  
  @Override
  public User updateUser(User user ) 
  {
	  
	  User u=  userRep.findById(user.getUserId()).get();
	  
	 
		/*
		 * if(user.getAddressId()!=0) {
		 * 
		 * u.setAddressId(user.getAddressId()); }
		 */
	  
	  if(user.getNumber()!=0)
	  {
		  u.setNumber(user.getNumber());
		  
	  }
	  
	  if(user.getUserName()!=null)
	  {
		  
		  u.setUserName(user.getUserName());
	  }
	  
	  if(user.getEmail()!=null)
	  {
		  u.setEmail(user.getEmail());
	  }
	  
	  if(user.getCartId()!=0)
	  {
		  u.setCartId(user.getCartId());
	  }
	  
		 return userRep.save(u);
	  
	  
	  
			/*
			 * System.out.println(user.getEmail()); System.out.println(user.getNumber());
			 * System.out.println(user.getUserName()); System.out.println(user.getUserId());
			 * System.out.println();
			 * 
			 * 
			 * System.out.println(u.getAddressId()); System.out.println(u.getCartId());
			 * System.out.println(u.getEmail()); System.out.println(u.getNumber());
			 * System.out.println(u.getUserName()); System.out.println(u.getUserId());
			 * 
			 */
	  
	  
	  
  }
  
  @Override
  public void deleteUser(int id)
  {
	  userRep.deleteById(id);
  
  
  } }
 