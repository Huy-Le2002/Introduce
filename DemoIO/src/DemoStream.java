import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DemoStream {
    public static void main(String[] args)  {

        try {
            File file = new File("D:\\java_core\\file\\file-test-cp.txt");
            file.createNewFile();

            FileOutputStream out = new FileOutputStream("D:\\java_core\\file\\image.jpg");
            FileInputStream in = new FileInputStream("image.jpg");

            byte [] data = new byte[1024];

            int check;
            while ((check = in.read(data)) != -1){
                out.write(data,0 ,check);
            }
//            int check;
//            while ((check = in.read()) != -1){
//                out.write(check);
//            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
