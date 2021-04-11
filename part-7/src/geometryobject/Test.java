package geometryobject;
public class Test {
    public static void main(String[] args) {
//        Circle circle = new Circle(10,"green",true);
//        System.out.println(circle);
//        Shape shape = new Shape();
//        System.out.println(shape);
//        Rectangle rectangle = new Rectangle(4,6);
//        System.out.println(rectangle.getPerimeter());

//        Shape[] resizeable;
//        resizeable = new Shape[3];
//        {
//            resizeable[0] = new Circle(5);
//            resizeable[1] = new Rectangle(4,2);
//            resizeable[2] = new Square(3);
//            for (Shape s: resizeable
//                 ) {
//                s.resize(2);
//                System.out.println(s.toString());
//
//            }
//        }

        Circle circle1 = new Circle(5);
//        System.out.println(circle1);
        circle1.resize(2);
        System.out.println(circle1);
        Rectangle rectangle = new Rectangle(2,3);
        System.out.println(rectangle);
        Square square = new Square(2,1,4);
        System.out.println(square);
        square.howToColor();
    }
}
