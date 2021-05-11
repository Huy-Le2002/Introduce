package com.customer.presentation;

import com.customer.model.Customer;
import com.customer.service.CustomerService;

import java.io.IOException;
import java.util.Scanner;

public class MainCustomer {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        try {
            customerService.loadDB();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            creatMenu();
            choose = scanner.nextInt();
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
                    printCustomer();
                    break;
                case 4:
                    printDataCustomer();
                    break;
                case 5:
                    try {
                        increaseBill();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        } while (choose != 0);
    }

    private static void increaseBill() throws IOException {
        Scanner scanner = new Scanner(System.in);
        CustomerService customerService = new CustomerService();
        System.out.println("Nhập sđt muốn tăng bill");
        String sdt = scanner.nextLine();
        if (customerService.find(sdt) == null) {
            System.out.println("không tồn tại");
        } else {
            customerService.find(sdt).setSoDonHang(customerService.find(sdt).getSoDonHang()+1);
        }
        customerService.increaseBill();
    }

    private static void printDataCustomer() {
        CustomerService customerService = new CustomerService();
        customerService.print();
    }

    private static void printCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập sđt KH bạn muốn in");
        String sdt = scanner.nextLine();
        CustomerService customerService = new CustomerService();
        customerService.find(sdt);
        if (customerService.find(sdt) == null){
            System.out.println("Không tồn tại");
        } else {
            System.out.println(customerService.find(sdt).toString());
        }
    }

    private static void findCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số điện thoại KH");
        String sdt = scanner.nextLine();
        CustomerService customerService = new CustomerService();
        customerService.find(sdt);
        if (customerService.find(sdt) == null){
            System.out.println("Không tồn tại");
        } else {
            System.out.println(customerService.find(sdt).toStringMid());
        }
    }

    private static void addCustomer() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("Nhập sđt");
        String sdt = scanner.nextLine();
        System.out.println("Nhập email");
        String email = scanner.nextLine();
        System.out.println("Nhập giới tính");
        String gender = scanner.nextLine();
        Customer customer = new Customer(name,address,sdt,email,gender);
        CustomerService customerService = new CustomerService();
        customerService.addCustomer(customer);
    }

    private static void creatMenu() {
        System.out.println("-------Menu---------");
        System.out.println("1. Add Customer.");
        System.out.println("2. Find Customer.");
        System.out.println("3. Print Information Customer.");
        System.out.println("4. Print Data Customer.");
        System.out.println("5. Add Bill Customer.");
        System.out.println("0. Exit.");
        System.out.println("*************************");
    }
}
