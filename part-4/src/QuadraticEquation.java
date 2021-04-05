import java.util.Scanner;

public class QuadraticEquation {
    double a,b,c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant() {
        return (b*b)-(4*a*c);
    }
    public double getRoot1() {
        return (-b + Math.pow(this.getDiscriminant(),0.5)) / (2*a);
    }
    public  double getRoot2() {
        return (-b - Math.pow(this.getDiscriminant(),0.5)) / (2*a);
    }
    public  double getRoot3() {
        return -b/(2*a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a:");
        double a = scanner.nextDouble();
        System.out.println("Nhập b:");
        double b = scanner.nextDouble();
        System.out.println("Nhập c:");
        double c = scanner.nextDouble();
        QuadraticEquation calculator = new QuadraticEquation(a,b,c);
        if (calculator.getDiscriminant() > 0) {
            System.out.printf("Pt có 2 nghiệm phân biệt: x1=%.3f x2=%.3f " ,calculator.getRoot1(),calculator.getRoot2());
        }
        else  if (calculator.getDiscriminant() == 0) {
            System.out.println("phương trình có nghiệm kép: " + calculator.getRoot3());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
