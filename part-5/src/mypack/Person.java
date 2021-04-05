package mypack;

public class Person {
    public String name;
    public int age;
//    private int age;
    public float height;
    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public  void eat(String foodName) {
        System.out.println(name + "is eating" + foodName);
    }
    public int getAge() {
        return age;
    }

}
