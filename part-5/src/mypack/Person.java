package mypack;

public class Person {
    String name;
//     int age;
    private int age;
    public float height;

    public Person() {}
    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void eat(String foodName) {
        System.out.println(name + "is eating" + foodName);
    }
    public int getAge() {
        return age;
    }

}
