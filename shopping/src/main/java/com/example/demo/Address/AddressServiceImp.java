package com.example.demo.Address;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImp implements AddressService{
	
	@Autowired
	private AddressRepository addressRepo;
	
    // get address by id  
	public Optional<Address>  getAddress(int id)
	{
	  return addressRepo.findById(id);
	}
	
	//save address
	public Address  saveAddress(Address address)
	{
		return addressRepo.save(address);
	}
	
	//update address
	public Address putAddress(Address address)
	{
		Address ad=addressRepo.findById(address.getAddressId()).get();
		
		if(address.getName()!=null)
		{
			ad.setName(address.getName());
		}
		
		if(address.getAddressLine1()!=null)
		{
			ad.setAddressLine1(address.getAddressLine1());
		}
		
		if(address.getAddressLine2()!=null)
		{
			ad.setAddressLine2(address.getAddressLine2());
		}
		
		if(address.getCity()!=null)
		{
			ad.setCity(address.getCity());
		}
		if(address.getState()!=null)
		{
			ad.setState(address.getState());
		}
		
		if(address.getPostcode()!=0)
		{
			ad.setPostcode(address.getPostcode());
		}
		if(address.getMobileNo()!=0)
		{
			ad.setMobileNo(address.getMobileNo());
		}
		
		return addressRepo.save(ad);
	}
	
	//deleted address by id
	public void deleteAddress(int id)
	{
		addressRepo.deleteById(id);
	}
	

}
