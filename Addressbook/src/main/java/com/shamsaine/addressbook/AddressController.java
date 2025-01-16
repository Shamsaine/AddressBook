package com.shamsaine.addressbook;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.AutoWired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController{
    
    @AutoWired
    private AddressService addressService;

    @GetMapping
    public List<Address> getAll(){

    }
    
    @PostMapping("/addresses")
    public Address saveAddress(@RequestBody Address address){
        return addressService.save(address);
    }
    
}