package com.usearraylist.presentation;

import com.usearraylist.dal.PhoneBookDB;
import com.usearraylist.service.PhoneBookService;
import com.usearraylist.model.PhoneBook;

import java.io.IOException;
import java.util.Scanner;

public class MainPhoneBook {
    public static PhoneBookService phoneBookService = new PhoneBookService();
    public static void main(String[] args) {
//        try {
//            phoneBookService.loadFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            creatMenu();
            choose = scanner.nextInt();
            scanner.nextLine();

            switch (choose) {
                case 1:
                    showDB();
                    break;
                case 2:
                    try {
                        addPhoneBook();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        editPhoneBook();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    try {
                        removePhoneBook();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    findPhoneBook();
                    break;
                case 6:
                    try {
                        readFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 7:
                    try {
                        saveFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Nhập vào không hợp lệ");
                    break;
            }
        } while (choose != 8);
    }

    private static void saveFile() throws IOException {
        System.out.println("Bạn đã lưu thành công");
        phoneBookService.updateFile();
    }

    private static void readFile() throws IOException {
        phoneBookService.loadFile();
        System.out.println("Đọc file thành công");
    }

    private static void findPhoneBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số điện thoại muốn tìm");
        String phone = scanner.nextLine();
        System.out.println(phoneBookService.findByPhone(phone).toString());
    }

    private static void removePhoneBook() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số điện thoại muốn xóa");
        String phone = scanner.nextLine();
        if (phoneBookService.findByPhone(phone) != null) {
            PhoneBookDB.phoneBookArrayList.remove(phoneBookService.findByPhone(phone));
            System.out.println("Đã xóa thành công");
        } else {
            System.out.println("Xóa không thành công");
        }

    }

    private static void editPhoneBook() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số điện thoại mà bạn muốn sửa");
        String tel = scanner.nextLine();
        if (phoneBookService.findByPhone(tel) != null) {
            System.out.println(phoneBookService.findByPhone(tel));
            System.out.println("Nhập nhóm danh bạ:");
            String group = scanner.nextLine();
            System.out.println("Họ tên");
            String name = scanner.nextLine();
            System.out.println("Giới tính");
            String gender = scanner.nextLine();
            System.out.println("Địa chỉ");
            String address = scanner.nextLine();
            System.out.println("Ngày sinh");
            String dab = scanner.nextLine();
            System.out.println("Email");
            String email = scanner.nextLine();

            phoneBookService.findByPhone(tel).setGroup(group);
            phoneBookService.findByPhone(tel).setGroup(name);
            phoneBookService.findByPhone(tel).setGroup(gender);
            phoneBookService.findByPhone(tel).setGroup(address);
            phoneBookService.findByPhone(tel).setGroup(dab);
            phoneBookService.findByPhone(tel).setGroup(email);
            phoneBookService.updateFile();
        } else {
            System.out.println("Không tồn tại số điện thoại trên");
        }
    }

    private static void addPhoneBook() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String tel;
        do {
            System.out.println("Nhập số điện thoại: ");
            tel = scanner.nextLine();
            while (phoneBookService.findExists(tel) != null) {
                System.out.println("Sđt đã tồn tại, vui lòng nhập lại");
                tel = scanner.nextLine();
            }
        }while (!phoneBookService.checkPhoneNumber(tel));

        System.out.println("Nhập nhóm danh bạ");
        String group = scanner.nextLine();
        System.out.println("Nhập họ tên");
        String name = scanner.nextLine();
        System.out.println("Giới tính");
        String gender = scanner.nextLine();
        System.out.println("Địa chỉ");
        String address = scanner.nextLine();
        System.out.println("Ngày sinh");
        String dab = scanner.nextLine();
        String email ;
        do {
            System.out.println("Nhập email: ");
            email = scanner.nextLine();
            while (phoneBookService.findExists(email) != null) {
                System.out.println("Đã tồn tại email. Vui lòng nhập lại");
                email = scanner.nextLine();
            }
        }while (!phoneBookService.checkEmail(email));
        PhoneBook phoneBook = new PhoneBook(tel,group,name,gender,address,dab,email);
        phoneBookService.addPhoneBook(phoneBook);
    }

    private static void showDB() {
        phoneBookService.showListPhoneBook();
    }

    private static void creatMenu() {
        System.out.println("-----CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ-----");
        System.out.println("Chọn chức năng theo số để tiếp tục:");
        System.out.println("1. Xem danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Tìm kiếm");
        System.out.println("6. Đọc từ file");
        System.out.println("7. Ghi vào file");
        System.out.println("8. Thoát");
        System.out.println("Chọn chức năng:");
    }
}
