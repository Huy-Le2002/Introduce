import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("tất cả số chẵn từ 0 đến số bạn nhập vào");
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();
        for (int i = 0; i <= number;i++ ){
            if ( i%2 == 0 )
                System.out.println(i);
        }
    }
}
