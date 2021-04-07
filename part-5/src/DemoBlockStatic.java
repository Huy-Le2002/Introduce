public class DemoBlockStatic {
    static String course;
    static {
        System.out.println("Codegym");
        course = "Java";
    }

    public static void main(String[] args) {
        System.out.println("C0221H1");
        System.out.println(DemoBlockStatic.course);
    }
}
