package com.student.presentation;

import com.student.model.Student;
import com.student.service.StudentService;

import java.io.IOException;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        try {
            studentService.loadData();
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
                        addStudent();
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        deleteStudent();
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    printStudent();
                    break;
                case 4:
                    editStudent();
                    break;
                case 5:
                    System.out.println("quit");
                    break;
                default:
                    System.out.println("Mời bạn nhập lại");
                    break;
            }
        } while (choose != 5);
    }

    private static void editStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id mà bạn muốn sửa");
        int id = scanner.nextInt();
        scanner.nextLine();
        StudentService studentService = new StudentService();
        studentService.find(id);
//        Student student = studentService.find(id);
        if (studentService.find(id) != null) {
            System.out.println(studentService.find(id).toString());
            System.out.println("Nhập tên:");
            String name = scanner.nextLine();
//            scanner.nextLine();
            System.out.println("Nhập giới tính");
            String gender = scanner.nextLine();

            System.out.println("Nhập tuổi");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập địa chỉ");
            String address = scanner.nextLine();
            studentService.find(id).setAddress(address);
            studentService.find(id).setAge(age);
            studentService.find(id).setGender(gender);
            studentService.find(id).setName(name);
            studentService.updateFile();
        } else {
            System.out.println("Không tồn tại");
        }
    }

    private static void printStudent() {
        StudentService studentService = new StudentService();
        studentService.print();
    }

    private static void deleteStudent() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id mà bạn muốn xóa");
        int id = scanner.nextInt();
        StudentService studentService = new StudentService();
        studentService.remove(id);
    }

    private static void addStudent() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập địa chỉ:");
        String address = scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        String gender = scanner.nextLine();
        Student student = new Student(0,name,age,address,gender);
        StudentService studentService = new StudentService();
        studentService.add(student);
    }

    private static void creatMenu() {
        System.out.println("-------Menu---------");
        System.out.println("1. Add Student.");
        System.out.println("2. Delete Student.");
        System.out.println("3. Print Student.");
        System.out.println("4. Edit.");
        System.out.println("5. Exit.");
    }
}