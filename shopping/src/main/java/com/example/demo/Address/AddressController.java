package com.example.demo.Address;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
	
	@Autowired
	private AddressService  addressService;
	
	@GetMapping(path="/address/{id}")
	public  Optional<Address> getAddressById(@PathVariable int id )
	{
		return addressService.getAddress(id);
	}
	
	@PostMapping(path="/address")
	public Address saveAddress(@RequestBody Address address)
	{
		return addressService.saveAddress(address);
	}
	
	@PutMapping(path="/address")
	public  Address putAddress(@RequestBody Address address)
	{
		return addressService.putAddress(address);
	}
	
	@DeleteMapping(path="/address/{id}")
	public void deleteAddress(@ PathVariable int id)
	{
		 addressService.deleteAddress(id);
	}

}
