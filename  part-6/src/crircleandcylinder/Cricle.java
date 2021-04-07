package crircleandcylinder;

public class Cricle {
    public double radius;
    public String color;

    public Cricle() {
    }

    public Cricle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return 3.14*(this.radius*this.radius);
    }

    @Override
    public String toString() {
        return "attributes radius = "+this.radius+" ; color: "+this.color;
    }
}
