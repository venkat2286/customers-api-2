package com.deere.customers;

import com.deere.customers.Customer2;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerRepository2 {

    static int Customer2Id = 6;
//    static Map<String, Customer2> Customer2s = Map.of("1", new Customer2(1, "Venkat", "Mallapally", "", "male", "563232222", "venkatm@gmail.com"),
//            "2", new Customer2(2, "Nathan", "Miller", "", "male", "563232222", "nathan@gmail.com"),
//            "3", new Customer2(3, "Siddhesh", "Pathak", "", "male", "563232222", "sidesh@gmail.com"),
//            "4", new Customer2(4, "Alan T", "Terrel", "", "male", "563232222", "alan@gmail.com"),
//            "5", new Customer2(5, "Gopi", "Iyer", "", "male", "563232222", "gopi@gmail.com")
//
//    );
//      public List<Customer2> findAll() {
//        return new ArrayList<Customer2>(Customer2s.values());
//    }
//     public Customer2 findById(long id) {
//        System.out.println(Customer2s.get(id));
//        Customer2 Customer2 = Customer2s.get(id + "");
//        return Customer2;
//    }
//    public List<Customer2> findByName(String name) {
//        ArrayList<Customer2> all = (ArrayList<Customer2>) findAll();
//        List<Customer2> collect = all.stream().filter(Customer2 -> Customer2.firstName.equals(name)).collect(Collectors.toList());
//        return collect;
//    }


     private static List<Customer2> Customer2List=new ArrayList<>();

    static
    {
        Customer2List.add(new Customer2(1, "Venkat", "Mallapally", "", "male", "563232222", "venkatm@gmail.com","Moline"));
        Customer2List.add( new Customer2(2, "Nathan", "Miller", "", "male", "563232222", "nathan@gmail.com","Moline"));
        Customer2List.add(new Customer2(3, "Siddhesh", "Pathak", "", "male", "563232222", "sidesh@gmail.com","Moline"));
        Customer2List.add(new Customer2(4, "Alan T", "Terrel", "", "male", "563232222", "alan@gmail.com","Moline"));
        Customer2List.add(new Customer2(5, "Gopi", "Iyer", "", "male", "563232222", "gopi@gmail.com","Moline"));

    }

   public List<Customer2> findAll() {
        return Customer2List;
    }



    public Customer2 findById(long id) {

        Customer2 Customer2 = Customer2List.get((int) (id-1));
        return Customer2;
    }


    public Customer2 saveCustomer(Customer2 Customer2) throws Exception{
      Customer2.setId(Customer2Id);
       Customer2List.add(Customer2);
       Customer2Id++;
      return Customer2;
    }
}
