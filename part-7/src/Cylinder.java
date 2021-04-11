public class Cylinder extends Circle implements VolumeShape{
    private double heightCylinder;

    public Cylinder(double radius, double heightCylinder) {
        super(radius);
        this.heightCylinder = heightCylinder;
    }

    public double getHeightCylinder() {
        return heightCylinder;
    }

    public void setHeightCylinder(double heightCylinder) {
        this.heightCylinder = heightCylinder;
    }

    @Override
    public double getVolumeShape() {
        return this.heightCylinder*Math.PI*(this.getRadius()*this.getRadius());
    }
    @Override
    public void display() {
        System.out.println("Cylinder");
        System.out.println("VolumeShape:" + this.getVolumeShape());
    }
}
