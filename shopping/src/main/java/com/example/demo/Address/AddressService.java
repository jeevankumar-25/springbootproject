package com.example.demo.Address;

import java.util.Optional;

public interface AddressService {
	public Optional<Address>  getAddress(int id);
	public Address  saveAddress(Address address);
	public Address putAddress(Address address);
	public void deleteAddress(int id);

}
