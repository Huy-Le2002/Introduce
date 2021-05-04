import java.io.*;
public class DeleteFile {
    public static void main(String[] args)  {
        try {
            File file= new File("test.txt");
            if(!file.isFile()){
                file.createNewFile();
                System.out.println("success!");
            }
            BufferedWriter out = new BufferedWriter(new FileWriter("test.txt"));
            out.write("aString1\n");
            out.close();
            boolean success = (new File("test.txt")).delete();
            if (success) {
                System.out.println("The file has been successfully deleted");
            }
            BufferedReader in = new BufferedReader
                    (new FileReader("test.txt"));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            in.close();
            out.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

