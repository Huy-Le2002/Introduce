import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n");
        int n = scanner.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }



        int increase = 0;
        int reduction = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] <= a[i + 1]) {
                increase++;
            }
            if (a[i] >= a[i + 1]) {
                reduction++;
            }
        }

        if (increase == a.length - 1 || reduction == a.length - 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}