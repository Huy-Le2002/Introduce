package geometryobject;
public class Square extends  Rectangle implements Resizeable,Colorable{
    public double side = 1.0;

    public Square() {
        super();
    }
    public Square(double side) {
        super();
        this.side = side;
    }
    public Square(double side,double width, double length) {
        super(width, length);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public void setWidth(double width) {
        setSide(width);
    }
    public void setLength(double length) {
        setSide(length);
    }
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "A Square with side="+this.side+", which is a subclass of "+super.toString();
    }

    @Override
    public void resize(double percent) {
        this.side *= percent;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides ");
    }
}
