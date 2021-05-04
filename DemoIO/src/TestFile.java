import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) {
        File file = new File("D:\\java_core\\file");

        try {
            if(file.mkdirs()){

                file = new File("D:\\java_core\\file\\test.txt");
                if (file.exists()){
                    System.out.println("file is exist");
                }else file.createNewFile();
            }else {
                file = new File("D:\\java_core\\file\\test.txt");
                if (file.exists()){
                    System.out.println("file is exist");
                }else file.createNewFile();
            }
            System.out.println(file.getPath());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
