package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly RW=new RWOnly();
       // RW.name="value";
       // System.out.println(RW.name);
        RW.setName("value");
        RW.getName();
    }
}