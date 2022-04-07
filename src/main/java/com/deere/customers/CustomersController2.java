package com.deere.customers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomersController2 {

    @Autowired
    private CustomerRepository2 repository;

    @GetMapping(value="customers")
    public List<Customer2> getCustomers() {
        return repository.findAll();
    }



    @PostMapping(value = "customer")
    public ResponseEntity<Customer2>saveCustomer(@RequestBody Customer2 customer) throws Exception{
        Customer2 customer1 = repository.saveCustomer(customer);
        return new ResponseEntity<Customer2>(customer1, HttpStatus.OK);
    }

     @GetMapping(value = "customers/{id}")
    public ResponseEntity<Customer2> getCustomerById(@PathVariable("id") long id) {
        Customer2 customer = repository.findById(id);
        System.out.println(customer);
        return new ResponseEntity<Customer2>(customer, HttpStatus.OK);
    }







//
//    @GetMapping(value = "/customer")
//    public ResponseEntity<List<Customer2>> getCustomerByName(@RequestParam(required = false) String name) {
//        List<Customer2> byName = repository.findByName(name);
//        return new ResponseEntity<List<Customer2>>(byName, HttpStatus.OK);
//    }

    @GetMapping(value = "/healthz")
    public String getHealth() {
        return "Healthy";
    }
}
