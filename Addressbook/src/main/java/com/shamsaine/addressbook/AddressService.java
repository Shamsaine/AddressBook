package com.shamsaine.addressbook;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.HashMap;
import java.util.UUID;

@Service
public class AddressService{
    
    private Map<String, Address> addresses = new HashMap<>();
    public Address save(Address address){
        if (address.getId() == null){
            String id = UUID.randomUUID().toString();
            address.setID(id);
        }
        addresses.put(address.getId(), address);
        return null;
    }
}