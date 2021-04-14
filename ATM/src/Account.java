import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.Scanner;

public class Account {
    public long soTienTrongTk;
    public ArrayList<String> history = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);
    public Account() {
    }
    public Account(long soTienTrongTk) {
        this.soTienTrongTk = soTienTrongTk;

    }

    public long getSoTienTrongTk() {
        return soTienTrongTk;
    }

    public void setSoTienTrongTk(long soTienTrongTk) {
        this.soTienTrongTk = soTienTrongTk;
    }
    public void napTien() {
        long nap;
        nap = sc.nextLong();
        if (nap >= 100000) {
            soTienTrongTk = this.soTienTrongTk + nap;
            System.out.println("Giao dịch thành công.Bạn vừa nạp" + nap + "vào tài khoản");
            history.add("Nạp tiền: "+ nap);
        } else {
            System.out.println("Số tiền nhập vào không hợp lệ");
        }

    }
    public void rutTien() {
        long rut;
        System.out.println("Nhập số tiền bạn cần rút");
        rut = sc.nextLong();
        if (rut <= soTienTrongTk) {
            soTienTrongTk = soTienTrongTk - rut;
            System.out.println("Giao dịch thành công.Bạn vừa rút" + rut + "trong tài khoản");
            history.add("Rút tiền " + rut);
        } else {
            System.out.println("Số tiền rút không hợp lệ");
        }

    }
    public void lichSuGiaoDich() {
        for (int i = 0; i < history.size();i++) {
            System.out.println(i + 1 + ". " +history.get(i) + "vnđ");
        }
    }
}
