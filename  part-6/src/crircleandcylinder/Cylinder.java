package crircleandcylinder;

public class Cylinder extends Cricle {
    public double height;

    public Cylinder() {
        super();
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getVolume() {
        return this.height * super.getArea();
    }


    @Override
    public String toString() {
        return "attributes class Cylinder: height = "+this.height+super.toString();
    }
}
