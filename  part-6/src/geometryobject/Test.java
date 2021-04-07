package geometryobject;
public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(10,"green",true);
        System.out.println(circle);
        Shape shape = new Shape();
        System.out.println(shape);
        Rectangle rectangle = new Rectangle(4,6);
        System.out.println(rectangle.getPerimeter());
    }
}
