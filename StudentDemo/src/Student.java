import java.util.Calendar;
import java.util.Date;

public class Student {
    public String name;
    public Date dob;

    public Student(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }
    public int calculatorAge() {
        //Calendar calendar = Calendar.getInstance();
        //
        //calendar.setTimeInMillis(this.dob.getTime());
        //System.out.println(calendar.getTime());
        //
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int i = year - this.dob.getYear();
        return i; //calendar.get(Calendar.YEAR);
    }


    public static void main(String[] args) {
        Student student = new Student("Huy",new Date(99,10,10,11,31));
        System.out.println(student.calculatorAge());
    }
}
