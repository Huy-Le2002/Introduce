package geometryobject;
public class Circle extends Shape implements  Resizeable {
    public double radius = 1.0;

    public Circle() {
        super();
    }
    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    public Circle(double radius,String color,boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="+this.radius+", which is a subclass of "+super.toString();
    }

    @Override
    public void resize(double percent) {
        this.radius *= percent;

    }
}
