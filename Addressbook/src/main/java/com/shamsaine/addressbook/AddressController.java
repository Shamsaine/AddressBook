package com.shamsaine.addressbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/addresses")
    public List<Address> getAll() {
        return addressService.getAll();
    }

    @PostMapping("/addresses")
    public Address saveAddress(@RequestBody Address address) {
        return addressService.save(address);
    }
}