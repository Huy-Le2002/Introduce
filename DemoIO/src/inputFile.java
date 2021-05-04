import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class inputFile {
    public static void main(String[] args) throws IOException {
        // khai báo biến out
        FileOutputStream out = null;
        Scanner  scanner = new Scanner(System.in);
        // khai báo try/catch/finally

        try{
            // khởi tạo out với lơp FileOutputStream
            out = new FileOutputStream("file-test.txt",true);
            for (;;){
                System.out.println("nhập data :");
                String line = scanner.nextLine() + "\n";

                // lấy data nhập vào để add vào bằng hàm write()
                byte [] data = line.getBytes();
                out.write(data);

                System.out.println("bạn có muốn nhập tiếp không Y/N");
                String next = scanner.nextLine();
                if(next.equalsIgnoreCase("n")){
                    break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {

            if(out != null) out.close();
        }
    }
}
