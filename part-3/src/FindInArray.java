import java.util.Scanner;

public class FindInArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name’s student:");
        String input_name = scanner.nextLine();
        int count = 0;
//        boolean isExist = false;

        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                count++;
                System.out.println("Position of the students in the list " + input_name + " is: " + (i + 1));
                break;
            }
        } if (count==0) {
            System.out.println("Not found " + input_name + " in the list.");
        }

    }
}
