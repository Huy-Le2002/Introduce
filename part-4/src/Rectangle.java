import java.util.Scanner;

public class Rectangle {
    private double w,h;
    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    public double getArea() {
        return this.w * this.h;
    }
    public double getPerimeter() {
        return (this.w + this.h)*2;
    }
    public String display() {
        return "Rectangle{" + "width=" + w + ", height=" + h + "}";
    }

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the width:");
//        double w = scanner.nextDouble();
//        System.out.print("Enter the height:");
//        double h = scanner.nextDouble();
        Rectangle calculator = new Rectangle(5,5);
//        calculator.setW(6);
        System.out.println("Your Rectangle \n"+ calculator.display());
        System.out.println("Perimeter of the Rectangle: "+ calculator.getPerimeter());
        System.out.println("Area of the Rectangle: "+ calculator.getArea());

    }
}
