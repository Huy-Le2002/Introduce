import java.io.FileReader;
import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("test.txt");
            Scanner scanner = new Scanner(fileReader);
//            System.out.println(scanner.hasNextLine());

            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
//            int check;

//            while ((check = fileReader.read()) != -1){
//                System.out.print((char) check);
//            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
