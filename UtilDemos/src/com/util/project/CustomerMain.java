package com.util.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CustomerMain {
    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Bhargav", 303099, "Bangalore"));
        customerList.add(new Customer("Ashwini", 303098, "Delhi"));
        customerList.add(new Customer("Mohit", 303097, "Hyderabad"));
        customerList.add(new Customer("Bhagya", 303096, "Chennai"));
        customerList.add(new Customer("Nidhi", 303029, "Bangalore"));
        customerList.add(new Customer("Priya", 303095, "Pune"));
        customerList.add(new Customer("Teja", 303049, "Bangalore"));

        List<Customer> bangaloreCustomers = new ArrayList<>();
//        Collections.sort(customerList);

        for (Customer customer : customerList ) {
            if((customer.getCity().toLowerCase()).equalsIgnoreCase("bangalore"))
                bangaloreCustomers.add(customer);
        }

        for (Customer customer : customerList ) {
            System.out.println(customer);
        }

    }
}
