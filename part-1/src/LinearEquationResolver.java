import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = scanner.nextFloat();
        System.out.println("b: ");
        double b = scanner.nextFloat();
        System.out.println("c: ");
        double c = scanner.nextFloat();
        if (a != 0) {
            double x = (c-b)/a;
            System.out.printf("phương trình có nghiệm: %f\n",x);
        }
        else {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            }
            else System.out.println("Phương trình vô nghiệm");
        }
    }
}
