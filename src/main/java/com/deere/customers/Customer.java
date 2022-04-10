package com.deere.customers;

public class Customer {
    long customerId;
    String firstName;
    String lastName;
    String title;
    String gender;
    String phone;
    String email;

    public Customer(long customerId, String firstName, String lastName, String title, String gender, String phone, String email) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
    }


    public long getcustomerId() {
        return customerId;
    }

    public void setcustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
