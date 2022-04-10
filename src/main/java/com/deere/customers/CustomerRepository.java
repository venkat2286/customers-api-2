package com.deere.customers;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CustomerRepository {

    static int customerId = 6;
//    static Map<String, Customer> customers = Map.of("1", new Customer(1, "Venkat", "Mallapally", "", "male", "563232222", "venkatm@gmail.com"),
//            "2", new Customer(2, "Nathan", "Miller", "", "male", "563232222", "nathan@gmail.com"),
//            "3", new Customer(3, "Siddhesh", "Pathak", "", "male", "563232222", "sidesh@gmail.com"),
//            "4", new Customer(4, "Alan T", "Terrel", "", "male", "563232222", "alan@gmail.com"),
//            "5", new Customer(5, "Gopi", "Iyer", "", "male", "563232222", "gopi@gmail.com")
//
//    );
//      public List<Customer> findAll() {
//        return new ArrayList<Customer>(customers.values());
//    }
//     public Customer findById(long id) {
//        System.out.println(customers.get(id));
//        Customer customer = customers.get(id + "");
//        return customer;
//    }
//    public List<Customer> findByName(String name) {
//        ArrayList<Customer> all = (ArrayList<Customer>) findAll();
//        List<Customer> collect = all.stream().filter(customer -> customer.firstName.equals(name)).collect(Collectors.toList());
//        return collect;
//    }


     private static List<Customer> customerList=new ArrayList<>();

    static
    {
        customerList.add(new Customer(1, "Venkat", "Mallapally", "", "male", "563232222", "venkatm@gmail.com"));
        customerList.add( new Customer(2, "Nathan", "Miller", "", "male", "563232222", "nathan@gmail.com"));
        customerList.add(new Customer(3, "Siddhesh", "Pathak", "", "male", "563232222", "sidesh@gmail.com"));
        customerList.add(new Customer(4, "Alan T", "Terrel", "", "male", "563232222", "alan@gmail.com"));
        customerList.add(new Customer(5, "Gopi", "Iyer", "", "male", "563232222", "gopi@gmail.com"));

    }

   public List<Customer> findAll() {
        return customerList;
    }



    public Customer findById(long id) {

        Customer customer = customerList.get((int) (id-1));
        return customer;
    }


    public Customer saveCustomer(Customer customer) throws Exception{
      customer.setcustomerId(customerId);
       customerList.add(customer);
       customerId++;
      return customer;
    }
}
