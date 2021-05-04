import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
            hashMap.put("Huy",23);
            hashMap.put("Khoa",20);
            hashMap.put("Chương",23);
            hashMap.put("Phong",29);
        for (Map.Entry<String, Integer> entry:
             hashMap.entrySet()) {
            System.out.println(entry.getKey()+"****"+entry.getValue());
        }
//        System.out.println("Display entries in HashMap");
//        System.out.println(hashMap + "\n");
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
            System.out.println("Display entries in ascending order of key");
            System.out.println(treeMap);
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(hashMap);
//            linkedHashMap.put("Huy",23);
//            linkedHashMap.put("Khoa",20);
//            linkedHashMap.put("Chương",23);
//            linkedHashMap.put("Phong",29);
            System.out.println(linkedHashMap);
            System.out.println("\nThe age for " + "Huy is " + linkedHashMap.get("Huy"));
    }
}

