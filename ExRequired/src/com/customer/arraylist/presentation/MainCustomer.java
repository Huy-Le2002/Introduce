package com.customer.arraylist.presentation;

import com.customer.arraylist.model.Customer;
import com.customer.arraylist.service.CustomerService;

import java.io.IOException;
import java.util.Scanner;

public class MainCustomer {
    public static CustomerService customerService = new CustomerService();
    public static void main(String[] args) {

        try {
            customerService.loadFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("\n");
            creatMenu();
            choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1:
                    try {
                        addCustomer();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                   findCustomer();
                   break;
                case 3:
                    printInfoCustomer();
                    break;
                case 4:
                    printDBCustomer();
                    break;
                case 5:
                    increaseBill();
                    break;
            }
        } while (choose != 0);
    }

    private static void increaseBill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số điện thoại bạn muốn tăng số đơn hàng");
        String tel = scanner.nextLine();
        System.out.println(customerService.creaseBill(tel));
    }

    private static void printDBCustomer() {
        customerService.sortName();
        customerService.print();

    }

    private static void printInfoCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập sđt mà bạn muốn tìm kiếm");
        String tel = scanner.nextLine();
        System.out.println(customerService.findByPhoneNumber(tel).toString());
    }

    private static void findCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập sđt mà bạn muốn tìm kiếm");
        String tel = scanner.nextLine();
        System.out.println(customerService.findByPhoneNumber(tel).toStringSearch());
    }

    private static void addCustomer() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("Nhập email");
        String email = scanner.nextLine();
        while (customerService.findByEmail(email) != null) {
            System.out.println("Email đã tồn tại, vui lòng nhập lại");
            email = scanner.nextLine();
        }
        System.out.println("Nhập sđt");
        String tel = scanner.nextLine();
        while (customerService.findByPhoneNumber(tel) != null) {
            System.out.println("Sđt đã tồn tại, vui lòng nhập lại");
            tel = scanner.nextLine();
        }
        System.out.println("Nhập giới tính");
        String gender = scanner.nextLine();
        Customer customer = new Customer(name,address,tel,email,gender);
        customerService.addCustomer(customer);
    }

    private static void creatMenu() {
        System.out.println("----Chào mừng bạn đến với hệ thống quản lý khách hàng: -----");
        System.out.println("Bấm 1 để nhập khách hàng: ");
        System.out.println("Bấm 2 để tìm kiếm khách hàng:");
        System.out.println("Bấm 3 để in thông tin khách hàng: ");
        System.out.println("Bấm 4 để in toàn bộ danh sách khách hàng: ");
        System.out.println("Bấm 5 để tăng số đơn hàng cho khách: ");
        System.out.println("Bấm 0 để thoát khỏi chương trình: ");
        System.out.println("--------------------------------------------------------------");
    }
}
