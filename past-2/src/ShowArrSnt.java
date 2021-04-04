import java.util.Scanner;
public class ShowArrSnt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập SNT cần in: ");
        int n = scanner.nextInt();
        int dem = 0;
        int i = 2;
        while (dem < 20) {
            if (isPrimeNumber(i) == true) {
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }
    }
    public static boolean isPrimeNumber(int num) {
        if (num < 2) {
            return false;
        }
        else  {
            for (int i = 2;i <= num/2; i++) {
                if (num%i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}



