package com.example;


public class User {

    private int age;
    private String name;
    private String adress;
    private String city;

    public User(int age, String name, String address, String city) {
        this.age = age;
        this.name = name;
        this.adress = address;
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return adress;
    }

    public String getCity() {
        return city;
    }
}
