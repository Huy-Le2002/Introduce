import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Width:");
        width = scanner.nextFloat();
        System.out.println("Enter Height");
        height = scanner.nextFloat();
        float s = width*height;
        System.out.println("Area: "+s);
    }
}
