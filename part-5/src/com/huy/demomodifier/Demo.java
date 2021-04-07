package com.huy.demomodifier;
import mypack.Person;
public class Demo {
    public static void main(String[] args) {
        Person person = new Person("Huy",18,1.7f);
        System.out.println(person.getName());
        person.setName("Khánh");
        System.out.println(person.getName());
    }
}
