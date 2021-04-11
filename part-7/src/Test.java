public class Test {
    public static void main(String[] args) {
        Shape[] shape = new Shape[4];
        shape[0] = new Circle(5);
        shape[1] = new Rectangle(5,2);
        shape[2] = new Cylinder(2,4);
        shape[3] = new Rectangular(2,3,4);

        for (Shape s: shape
        ) {
            System.out.println("********************");
            s.display();
        }
    }
}
