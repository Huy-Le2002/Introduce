import java.io.*;
import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) throws IOException {
// thao tác với file và các hàm thông dụng

        //        File file = new File("test.txt");
//        if (file.isFile()){
//            System.out.println("File :" + file.getAbsolutePath());
//            file.delete();
//        }else {
//            System.out.println("not found");
//            file.createNewFile();
//        }


        // sử dụng Datainputstream để lấy dữ liệu nhập vào
        // cách 1:

//        DataInputStream inputStream = new DataInputStream(System.in);
//        System.out.println("nhập N :");
//        int N = Integer.parseInt(inputStream.readLine());
//        System.out.println(N);

        // cách 2 :
//        System.out.println("nhập M :");
//        String M = System.console().readLine();
//        System.out.println(M);

        // dọc dữ liệu từ 1 file, chỉ đc độc file Text và nhị phân
//        FileInputStream inputStream = null;
//        FileOutputStream outputStream = null;
//        try  {
//             inputStream = new FileInputStream("myfile3.txt");
//             outputStream = new FileOutputStream("test.txt");
//             int check;
//             while ((check = inputStream.read() ) != -1){ // - 1 là ký tự kết thúc
//                 System.out.print((char) check);
//                 outputStream.write(check);
//             }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }finally {
//            if (inputStream != null) {
//                inputStream.close();
//            }
//            if(outputStream!= null);
//            outputStream.close();
//        }


        // sử dụng FileRead để thao tác với file text, ko sử dụng cho nhị phân

        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {

            fileReader = new FileReader("test.txt");
            fileWriter = new FileWriter("test1.txt");
//            fileReader.skip(5);
//            fileReader.reset();
            int check;
            while ((check = fileReader.read()) != -1){

                System.out.print((char) check);
                fileWriter.write(check);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            if(fileReader !=null) fileReader.close();
            if(fileWriter != null) fileWriter.close();
        }
    }
}
