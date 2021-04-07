package mypack;

//import mypack.Person;

public class HelloWorld {
    public static void main(String[] args) {
        Person a = new Person("Huy",23,1.7f);
//        System.out.println(a.age);
        a.eat("Rice");
        System.out.println(a.name);
        a.name = "Khánh";
        System.out.println(a.name);
        int age = a.getAge();
        System.out.println("His age:" + age);
//        System.out.println(a.age);
    }
}
