import java.io.*;
import java.util.ArrayList;

public class SaveObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student1 = new Student("huy",23);
        Student student2 = new Student("phong",28);
        Student student3 = new Student("quang",29);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
       // creatFile("test.txt");
        writeFile(student1,"test.txt",true);
        writeFile(student2,"test.txt",true);
        writeFile(student3,"test.txt",true);
        System.out.println(readAllFile("test.txt").toString());
    }
    public static class Student implements Serializable {
        private String name;
        private int age;
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
    public static void creatFile(String path) throws IOException {
        File file = new File(path);
        if (file.exists()) {
            System.out.println("File is exists");
        } else {
            file.createNewFile();
        }
    }
    public static void writeFile(Student student, String path, boolean append) throws IOException {
        FileOutputStream fos = new FileOutputStream(path,append);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(student);
        oos.flush();
        oos.close();
        fos.close();
    }
    public static Student readFile(String path) throws IOException, ClassNotFoundException {
        FileInputStream  fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student student = null;
        if (fis.available() > 0) {
            student = (Student) ois.readObject();
        }
        return student;
    }
    public static ArrayList<Student> readAllFile(String path) throws IOException, ClassNotFoundException {
        ArrayList<Student> students = new ArrayList<>();
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        if (fis.available() > 0) {
            students = (ArrayList) ois.readObject();
        }
        ois.close();
      //  fis.close();
        return students;
    }

}
