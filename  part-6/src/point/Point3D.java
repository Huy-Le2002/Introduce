package point;
import  java.util.Arrays;

public class Point3D extends Point2D {
    public float z = 0.0f;

    public Point3D() {
        super();
    }
    public Point3D(float z) {
        super();
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z) {
        super.setXY(x,y);
        this.z = z;
    }
    public float[] getXYZ() {

        return new float[] {this.x,this.y,this.z};
    }

    @Override
    public String toString() {
        return Arrays.toString(getXYZ());
//        return "float[] arr = new float("+super.getX()+","+super.getY()+","+this.z+")";
    }


}
