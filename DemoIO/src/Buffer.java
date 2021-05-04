import java.io.*;

public class Buffer {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("image.jpg");
            BufferedInputStream buffIn = new BufferedInputStream(in);

            FileOutputStream out = new FileOutputStream("D:\\java_core\\file\\image.jpg");
            BufferedOutputStream bufOut = new BufferedOutputStream(out);

            byte [] data = new byte[1024];
            int check;
            while ((check = buffIn.read(data)) >= 0 ){
                bufOut.write(data,0,check);
            }

            buffIn.close();
            bufOut.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
