package point;

public class Test {

    public static void main(String[] args) {
        Point2D point2D = new Point2D(2,8);
        System.out.println(point2D);
        Point3D point3D = new Point3D(3);
        point3D.setXY(1,2);
        System.out.println(point3D);
//        point3D.toString();
    }
}
