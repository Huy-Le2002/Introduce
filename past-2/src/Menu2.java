import java.util.Scanner;

public class Menu2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = -1;

        while (n != 0) {
            System.out.println("Menu:");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            System.out.println("Enter your choice: ");
            n = input.nextInt();
            switch (n) {
                case 1:
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 6; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("top-left");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 5; j >= i; j--) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                    System.out.println("top-right");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if (j < i) {
                                System.out.print("  ");
                            } else {
                                System.out.print("* ");
                            }
                        }
                        System.out.println();
                    }
//
                    System.out.println("bottom-left");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Tam giác cân");
                    for(int i=1;i<=6;i++)
                    {
                        for(int j=i;j<=6;j++)
                        {
                            System.out.print(" ");
                        }
                        for(int j=1;j<=i;j++)
                        {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
