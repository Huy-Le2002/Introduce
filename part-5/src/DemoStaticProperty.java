//static property
public class DemoStaticProperty {
    private String name;
    public int age;
    public float height;
    public static String universityName = "CodeGym";
    public  static  int total = 0;

    DemoStaticProperty(){

    }
    public DemoStaticProperty(String name, int age, float height) {
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
        System.out.println(DemoStaticProperty.universityName);
        DemoStaticProperty a = new DemoStaticProperty("Huy",23,1.7f);
//        System.out.println(a.universityName);
        System.out.println(DemoStaticProperty.total);
//        System.out.println(a.total);
        DemoStaticProperty b = new DemoStaticProperty("Khánh",18,1.5f);
        System.out.println(DemoStaticProperty.total);
    }
}
