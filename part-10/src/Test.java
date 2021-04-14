import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n");
        int n = scanner.nextInt();
        int a[] = new int[n];
        for (int i = 0;i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println();
        System.out.println("Nhập k");
        int k = scanner.nextInt();

        System.out.println("Nhập x");
        int x = scanner.nextInt();

        int b[] = new int[n+1];
        for (int i = 0;i < k;i++) {
            b[i] = a[i];
        }
        for (int i = k + 1;i <= n;i++) {
            b[i] = a[i-1];
        }
        b[k] = x;
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i] + " ");
        }
    }
}
