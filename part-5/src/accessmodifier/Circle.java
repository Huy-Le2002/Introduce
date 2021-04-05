package accessmodifier;

public class Circle {
    private static double radius;
    private String color;
    private double area;
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public   double getArea() {
        return Math.PI*this.radius*this.radius;
    }
//    public static double setStaticRadius(){
//        radius = 10;
//        return radius;
//    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}
