import javax.xml.crypto.Data;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws IOException {
//        try {
//            File input = new File("test.txt");
//            if(input.isFile()){
//                System.out.println("hello");
////                input.delete();
//            }else {
//                System.out.println("not found");
//                boolean newFile = input.createNewFile();
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//          input.close();
//    }


//         add data băng outputStream;

//        FileOutputStream out = null;
//        String text = "Codegym";
//        byte[] data = text.getBytes(StandardCharsets.UTF_8);
//        try {
//             out = new FileOutputStream("test1.txt");
//             out.write(data);
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            out.close();
//        }


//        đọc file băng inputStream

        FileInputStream input = null;
        FileOutputStream out = null;
        try{
            input = new FileInputStream("file-test.txt");
            out = new FileOutputStream("file-test.txt");
            String text = "hello codegym";

            out.write(text.getBytes());
            int check;
            while ((check = input.read()) != -1 ){
                System.out.print((char)check);

            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            input.close();
        }

        // sử dụng buffer
//
//        FileInputStream input = null;
//        BufferedInputStream  bufferedInputStream = null;
//        try {
//            input = new FileInputStream("test1.txt");
//            bufferedInputStream = new BufferedInputStream(input);
//
////            khai báo bộ nhớ tạm và lấy length của data;
////            byte [] data = new byte[100];
////            int length = bufferedInputStream.read(data);
//            int i;
//            while ((i = bufferedInputStream.read()) != -1) {
//                System.out.print((char) i);
//            }
//            // đọc data bằng buffer
////            String result = new String(data);
////            System.out.println(result);
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            if (input != null){
//                input.close();
//                bufferedInputStream.close();
//            }
//        }


        // Data

//        try {
//            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
//            FileOutputStream fos = new FileOutputStream("mydata.bin");
//            DataOutputStream dos = new DataOutputStream(fos);
//            //Bước 2: Ghi dữ liệu
//            dos.writeInt(100);
//            dos.writeDouble(9.5);
//            //Bước 3: Đóng luồng
//            fos.close();
//            dos.close();
//            System.out.println("Done!");
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }

        // đọc data

//        try {
//            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
//            FileInputStream fis = new FileInputStream("mydata.bin");
//            DataInputStream dis = new DataInputStream(fis);
//            //Bước 2: Đọc dữ liệu
//            int n = dis.readInt();
//            double m = dis.readDouble();
//            //Bước 3: Đóng luồng
//            fis.close();
//            dis.close();
//            //Hiển thị nội dung đọc từ file
//            System.out.println("Số nguyên: " + n);
//            System.out.println("Số thực: " + m);
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
    }
}
