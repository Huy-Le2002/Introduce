import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = null;
        Account account = new Account(1200000);
        while (choice != "X") {
            System.out.println("Ngân hàng ACB xin kính chào Quý khách Lê Phan Quốc Huy");
            System.out.println("MENU:");
            System.out.println("1. Nhấn phím A để kiểm tra tài khoản");
            System.out.println("2. Nhấn phím D để nạp tiền");
            System.out.println("3. Nhấn phím W để rút tiền");
            System.out.println("4. Nhấn phím H để kiểm tra lịch sử");
            System.out.println("5. Nhấn phím X để thoát");
            System.out.println("===============================");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "A":
                    System.out.println("Số dư tk khách hàng: " + account.getSoTienTrongTk() + "vnđ");
                    System.out.println("Bấm nút theo menu để tiếp tục giao dịch");
                    System.out.println("===============================");
                    break;
                case "D":
                    System.out.println("Giao dịch nạp tiền");
                    System.out.println("Vui lòng nhập số tiền: ");
                    account.napTien();
                    System.out.println("Số dư trong tài khoản khách hàng là: " + account.soTienTrongTk + "vnđ");
                    System.out.println("Bấm nút theo menu để tiếp tục giao dịch");
                    System.out.println("===============================");
                    break;
                case "W":
                    System.out.println("Giao dịch rút tiền");
                    System.out.println("Vui lòng nhập số tiền: ");
                    account.rutTien();
                    System.out.println("Số dư trong tài khoản khách hàng là " + account.soTienTrongTk + "vnđ");
                    System.out.println("Bấm nút theo menu để tiếp tục giao dịch");
                    System.out.println("===============================");
                    break;
                case "H":
                    account.lichSuGiaoDich();
                case "X":
                    System.exit(0);
                default:
                    System.out.println("Bạn nhập sai chức năng");
                    System.out.println("Bấm nút theo menu để tiếp tục giao dịch");
                    System.out.println("===============================");
            }
        }
    }
}
