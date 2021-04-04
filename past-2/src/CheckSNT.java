import java.util.Scanner;

public class CheckSNT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số để kiểm tra:");
        int number = scanner.nextInt();
        if (number >= 2) {
            int count =0;
            for (int i = 2; i < number / 2; i++) {
                if (number % i == 0) {
                    count++;
                    break;
                }
            }
            if(count==0) {
                System.out.println(number + " là snt");
            }
            else{
                System.out.println(number + " không phải là snt");
            }
        }
        else {
            System.out.println("ko phai");
        }
    }
}
