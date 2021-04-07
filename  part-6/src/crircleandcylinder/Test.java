package crircleandcylinder;

public class Test {
    public static void main(String[] args) {
        Cricle cricle = new Cricle(1.5,"black");
        System.out.println(cricle);
        System.out.println(cricle.getArea());
        Cylinder cylinder = new Cylinder(4.6,"red",2);
        System.out.println(cylinder);
        System.out.println(cylinder.getVolume());
    }
}
