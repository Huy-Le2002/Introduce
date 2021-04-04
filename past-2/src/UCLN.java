import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.println("Nhập a:");
        a = scanner.nextInt();
        System.out.println("Nhập b:");
        b = scanner.nextInt();
        if (a == 0 || b == 0)
            System.out.println("No greatest common factor");
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        System.out.println("Ước chung lớn nhất: " + a);
    }
}
