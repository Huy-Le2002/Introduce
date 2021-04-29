import java.io.*;
import java.util.Map;

public class StudentDB {
    public void saveFile() throws IOException {
        File file = new File("data.csv");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileOutputStream fos = new FileOutputStream("data.csv");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        for (Map.Entry<Integer,Student> entry: StudentService.studentList.entrySet()) {
//            System.out.println(entry.getKey() + " - " + entry.getValue().toString());
            bos.write(entry.getValue().toStringCSV().getBytes());
        }
        bos.flush();
        fos.close();
        bos.close();
    }
    public void readFile() throws Exception {
        File file = new File("data.csv");
        if (!file.exists()) {
            return;
        }
        FileReader fr = new FileReader("data.csv");
        BufferedReader br = new BufferedReader(fr);
        String line;
        StudentService sv = new StudentService();
        while ((line = br.readLine()) != null) {
            String[] arr = line.split(",");
            Student st = new Student(arr[0],Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), arr[3]);
//            sv.add(st);
        }
    }

}
