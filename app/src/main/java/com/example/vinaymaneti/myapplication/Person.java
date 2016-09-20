package com.example.vinaymaneti.myapplication;

/**
 * Created by vinaymaneti on 7/24/16.
 */
public class Person {
    public String name;

    public Person(String personName) {
        name = personName;
    }

    public String greet(String yourName) {
        return String.format("Hi %s, my name is %s", name, yourName);
    }

    public static void main(String args[]){
        Person p = new Person("Vinay");
        System.out.print(p.greet("sdfhbsd"));
    }
}
