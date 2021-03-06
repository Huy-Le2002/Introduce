public class Rectangle implements Shape {
    private double width;
    private double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.width*this.length;
    }

    @Override
    public double getPerimeter() {
        return (this.length+this.width)*2;
    }

    @Override
    public void display() {
        System.out.println("Rectangle");
        System.out.println("Area:" + this.getArea());
        System.out.println("Perimeter:" + this.getPerimeter());
    }
}
