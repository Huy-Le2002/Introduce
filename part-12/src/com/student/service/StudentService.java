import java.util.HashMap;
import java.util.Map;

public class StudentService {
    public static Map<Integer,Student> studentList;
    public static int count;
    static {
        studentList = new HashMap<>();
//        Student s1 = new Student("Huy",23,1,"Nam");
//        Student s2 = new Student("Nam",25,2,"Nam");
//        Student s3 = new Student("Quang",18,3,"Nam");
//        Student s4 = new Student("Binh",28,4,"Nam");
//        studentList.put(1,s1);
//        studentList.put(2,s2);
//        studentList.put(3,s3);
//        studentList.put(4,s4);
//        count = 4;
        count = 0;
    }
    public  void add(Student student) {
        count++;
        student.setId(count);
        studentList.put(count,student);
    }
    public boolean remove(int id) {
        return studentList.remove(id) == null ? false : true;
    }
    public  void print() {
        for (Map.Entry<Integer,Student> entry: studentList.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().toString());
        }
    }
}
