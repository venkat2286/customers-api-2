package com.deere.customers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomersController {

    @Autowired
    private CustomerRepository repository;

    @GetMapping(value="customers")
    public List<Customer> getCustomers() {
        return repository.findAll();
    }

    @GetMapping(value = "customers/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("id") long id) {
        Customer customer = repository.findById(id);
        System.out.println(customer);
        return new ResponseEntity<Customer>(customer, HttpStatus.OK);
    }

    @PostMapping(value = "customer")
    public ResponseEntity<Customer>saveCustomer(@RequestBody Customer customer) throws Exception{
        Customer customer1 = repository.saveCustomer(customer);
        return new ResponseEntity<Customer>(customer1, HttpStatus.OK);
    }
//
//    @GetMapping(value = "/customer")
//    public ResponseEntity<List<Customer>> getCustomerByName(@RequestParam(required = false) String name) {
//        List<Customer> byName = repository.findByName(name);
//        return new ResponseEntity<List<Customer>>(byName, HttpStatus.OK);
//    }

    @GetMapping(value = "/healthz")
    public String getHealth() {
        return "Healthy";
    }
}
