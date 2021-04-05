package mypack;

import mypack.Person;

public class HelloWorld {
    public static void main(String[] args) {
        Person a = new Person("Huy",23,1.7f);
        a.eat("Rice");
        int age = a.getAge();
        System.out.println("His age:" + age);
//        System.out.println(a.age);
    }
}
