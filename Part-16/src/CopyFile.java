import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            File file = new File("D:\\fileCG\\MODULE 2\\Part-16\\src\\testFile.txt");
            inputStream = new FileInputStream(file);
            outputStream = new FileOutputStream(new File("testFile-Copy"));
            int length;
            System.out.println(file.getAbsolutePath());
            System.out.println(System.getProperty("testFile-Copy"));
            byte[] data = new byte[1024];
            while ((length = inputStream.read(data)) != -1) {
                outputStream.write(data,0,length);
            }
            System.out.println("success!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            inputStream.close();
            outputStream.close();
        }
    }
}
