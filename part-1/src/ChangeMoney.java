import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        System.out.println("Input Dolar:");
        Scanner scanner = new Scanner(System.in);
        int dolar = scanner.nextInt();
        int vnd = 24000;
        System.out.println(dolar + " $" + " bằng " + (dolar*vnd) + " vnđ");

    }
}
