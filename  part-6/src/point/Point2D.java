package point;
import  java.util.Arrays;

public class Point2D {
    public float x = 0.0f;
    public float y = 0.0f;

    public Point2D() {

    }
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        float[] arr = new float[2];
        arr[0] = this.x;
        arr[1] = this.y;
        return arr;
    }

    @Override
    public String toString() {
        return Arrays.toString(getXY());
//        return "float[] arr = new float("+getXY()[0]+","+getXY()[1]+")";

    }

}
