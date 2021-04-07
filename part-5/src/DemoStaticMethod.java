public class DemoStaticMethod {
    private String name;
    public int age;
    public float height;
    public static String universityName = "CodeGym";
    public static int total = 0;

    DemoStaticMethod() {
    }

    public DemoStaticMethod(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
        total += 1;
    }

    public static void getInforUniversity() {
        System.out.println(DemoStaticMethod.total);
//        System.out.println(name);
    }

    public static void main(String[] args) {

        DemoStaticMethod.getInforUniversity();
        DemoStaticMethod a = new DemoStaticMethod("Huy",18,1.7f);
        System.out.println(DemoStaticMethod.total);
        DemoStaticMethod.getInforUniversity();
    }
}


