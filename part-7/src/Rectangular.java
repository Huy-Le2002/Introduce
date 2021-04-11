public class Rectangular extends Rectangle implements VolumeShape{
    private double height;

    public Rectangular(double height) {
        this.height = height;
    }

    public Rectangular() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangular(double width, double length, double height) {
        super(width, length);
        this.height = height;
    }

    @Override
    public double getVolumeShape() {
        return getWidth()*getLength()*this.height;
    }
    @Override
    public void display() {
        System.out.println("Rectangular");
        System.out.println("VolumeShape: " + this.getVolumeShape());
    }

}
