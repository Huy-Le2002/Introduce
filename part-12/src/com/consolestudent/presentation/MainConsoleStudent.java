package com.consolestudent.presentation;

import com.consolestudent.dal.ConsoleStudentDB;
import com.consolestudent.model.ConsoleStudent;
import com.consolestudent.service.ConsoleStudentService;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;

public class MainConsoleStudent {
    public static void main(String[] args) {
        ConsoleStudentService consoleStudentService = new ConsoleStudentService();
        try {
            consoleStudentService.loadFile();
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
                    listStudent();
                    break;
                case 2:
                    try {
                        addStudent();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        editStudent();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    try {
                        deleteStudent();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:{
                    System.out.println("1. Nhập điểm học viên lần 1\n" +
                            "2. Nhập điểm học viên lần 2\n" +
                            "3. Nhập điểm học viên lần 3\n" +
                            "4. Nhập điểm học viên lần 4");
                    int x=scanner.nextInt();
                    scanner.nextLine();
                    switch (x) {
                        case 1:
                            input1();
                            break;
                        case 2:
                            input2();
                            break;
                        case 3:
                            input3();
                            break;
                        case 4:
                            input4();
                            break;
                        default:
                            System.out.println("Mời bạn nhập lại");
                            break;
                    }
                }
                    break;
                case 6:
                    editPoint();
                    break;
                case 7:
                    showAveragePoint();
                    break;
                default:
                    System.out.println("Mời bạn nhập lại");
                    break;
            }
        } while (choose != 0);

    }

    private static void showAveragePoint(){
        ConsoleStudentService consoleStudentService = new ConsoleStudentService();
        consoleStudentService.print();
    }

    private static void editPoint() {
        ConsoleStudentService consoleStudentService = new ConsoleStudentService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sv bạn muốn sửa điểm:");
        int maSV = scanner.nextInt();
        consoleStudentService.findStudent(maSV);
        if (consoleStudentService.findStudent(maSV) != null) {
            System.out.println(consoleStudentService.findStudent(maSV).toString());
            System.out.println("Hệ số 1");
            float heso1 = scanner.nextFloat();
            scanner.nextLine();
            System.out.println("Hệ số 2");
            float heso2 = scanner.nextFloat();
            scanner.nextLine();
            System.out.println("Hệ số 3");
            float heso3 = scanner.nextFloat();
            scanner.nextLine();
            System.out.println("Hệ số 4");
            float heso4 = scanner.nextFloat();
            scanner.nextLine();
            consoleStudentService.findStudent(maSV).setHeso1(heso1);
            consoleStudentService.findStudent(maSV).setHeso2(heso2);
            consoleStudentService.findStudent(maSV).setHeso3(heso3);
            consoleStudentService.findStudent(maSV).setHesoo4(heso4);
            consoleStudentService.updateFile();
        } else {
            System.out.println("Mã Sv ko tồn tại");
        }

        //viết hàm for tìm đến vị trí muốn sửa xong . set xong nhập
        for (Map.Entry<Integer, ConsoleStudent> entry: ConsoleStudentDB.consoleStudentDBMap.entrySet()) {
            
        }
    }

    private static void input4() {
        ConsoleStudentService consoleStudentService = new ConsoleStudentService();
        Scanner sc = new Scanner(System.in);
        for (Map.Entry<Integer, ConsoleStudent> entry: ConsoleStudentDB.consoleStudentDBMap.entrySet()) {
            System.out.println("Nhập điểm lần 4:" + consoleStudentService.findStudent(entry.getKey()).getName());
            float point4 = sc.nextFloat();
            entry.getValue().setHesoo4(point4);
        }
        consoleStudentService.updateFile();
    }

    private static void input3() {
        ConsoleStudentService consoleStudentService = new ConsoleStudentService();
        Scanner sc = new Scanner(System.in);
        for (Map.Entry<Integer, ConsoleStudent> entry: ConsoleStudentDB.consoleStudentDBMap.entrySet()) {
            System.out.println("Nhập điểm lần 3:" + consoleStudentService.findStudent(entry.getKey()).getName());
            float point3 = sc.nextFloat();
            entry.getValue().setHeso3(point3);
        }
        consoleStudentService.updateFile();
    }

    private static void input2() {
        ConsoleStudentService consoleStudentService = new ConsoleStudentService();
        Scanner sc = new Scanner(System.in);
        for (Map.Entry<Integer, ConsoleStudent> entry: ConsoleStudentDB.consoleStudentDBMap.entrySet()) {
            System.out.println("Nhập điểm lần 2:" + consoleStudentService.findStudent(entry.getKey()).getName());
            float point2 = sc.nextFloat();
            entry.getValue().setHeso2(point2);
        }
        consoleStudentService.updateFile();
    }

    private static void input1() {
        ConsoleStudentService consoleStudentService = new ConsoleStudentService();
        Scanner sc = new Scanner(System.in);
        for (Map.Entry<Integer, ConsoleStudent> entry: ConsoleStudentDB.consoleStudentDBMap.entrySet()) {
            System.out.println("Nhập điểm lần 1:" + consoleStudentService.findStudent(entry.getKey()).getName());
            float point1 = sc.nextFloat();
            entry.getValue().setHeso1(point1);
        }
        consoleStudentService.updateFile();
    }


    private static void deleteStudent() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã SV mà bạn muốn xóa");
        int id = scanner.nextInt();
        ConsoleStudentService consoleStudentService = new ConsoleStudentService();
        consoleStudentService.findStudent(id);
        if (consoleStudentService.findStudent(id) != null) {
            consoleStudentService.removeStudent(id);
        } else {
            System.out.println("Không tồn tại");
        }
    }

    private static void editStudent() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã SV mà bạn muốn sửa");
        int id = scanner.nextInt();
        scanner.nextLine();
        ConsoleStudentService consoleStudentService = new ConsoleStudentService();
        consoleStudentService.findStudent(id);
        if (consoleStudentService.findStudent(id) != null) {
            System.out.println(consoleStudentService.findStudent(id).toStringStudent());
            System.out.println("Nhập tên: ");
            String name = scanner.nextLine();
            consoleStudentService.findStudent(id).setName(name);
            consoleStudentService.updateFile();
        } else System.out.println("Mã Sv ko tồn tại");
    }

    private static void addStudent() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        ConsoleStudent consoleStudent = new ConsoleStudent(name,0);
        ConsoleStudentService consoleStudentService = new ConsoleStudentService();
        consoleStudentService.addStudent(consoleStudent);
    }

    private static void listStudent() {
        ConsoleStudentService consoleStudentService = new ConsoleStudentService();
        consoleStudentService.printStudent();
    }

    private static void creatMenu() {
        System.out.println("-------Menu---------");
        System.out.println("1. Xem danh sách học viên");
        System.out.println("2. Thêm học viên");
        System.out.println("3. Sửa thông tin học viên");
        System.out.println("4. Xóa học viên");
        System.out.println("5. Nhập điểm học viên");
        System.out.println("6. Sửa điểm học viên");
        System.out.println("7. Xếp loại học viên");
        System.out.println("0. Exit.");
    }

}
