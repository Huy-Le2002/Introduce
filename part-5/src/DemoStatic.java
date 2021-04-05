public class DemoStatic {
    private String name;
    public int age;
    public float height;
    public static String universityName = "CodeGym";
    public  static  int total = 0;

    DemoStatic(){

    }
    public DemoStatic(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
        total += 1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        System.out.println(DemoStatic.universityName);
        DemoStatic a = new DemoStatic("Huy",23,1.7f);
        System.out.println(a.universityName);
        a.setName("Khánh");
        System.out.println(a.getName());
    }
}
