package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwOnly = new RWOnly();

//        Expected 0 arguments but found 1

//        System.out.println(rwOnly.name);
//        name has private access in 'com.driver.RWOnly'

        rwOnly.setName("sachin");
        rwOnly.getName();
    }
}