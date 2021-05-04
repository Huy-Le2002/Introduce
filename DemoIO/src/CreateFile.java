import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try{
            File file = new File("myfile3.txt");
            if(file.createNewFile())
                System.out.println("Success!");
            else
                System.out.println
                        ("Error, file already exists.");
        }
        catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
