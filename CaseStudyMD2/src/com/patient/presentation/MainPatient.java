package com.patient.presentation;

import com.patient.dal.PatientDB;
import com.patient.model.Patient;
import com.patient.service.PatientService;

import java.io.IOException;
import java.util.Scanner;

public class MainPatient {
    public static PatientService patientService = new PatientService();

    public static void main(String[] args) {
        try {
            patientService.loadFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            creatMenu();
            choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1:
                    try {
                        addPatient();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        editPatient();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        deletePatient();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    findPatient();
                    break;
                case 5:
                    loadDBPatient();
                    break;
                case 6:
                    try {
                        inputCost();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 7:
                    try {
                        editCost();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 8:
                    payHospitalFees();
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập vào không phù hợp");
                    break;
            }
        } while (choose != 9);
    }

    private static void editCost() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id mà bạn muốn sửa chi phí");
        int id = scanner.nextInt();
        scanner.nextLine();
        String dayIn ;
        do {
            System.out.println("Nhập ngày vào viện");
            dayIn = scanner.nextLine();
        }while (patientService.checkDate(dayIn) == false);

        String dayOut;
        do {
            System.out.println("Nhập ngày ra viện");
            dayOut = scanner.nextLine();
        } while (patientService.checkDate(dayOut) == false);
        System.out.println("Nhập số buổi ăn");
        int numberOfMeals = scanner.nextInt();
        scanner.nextLine();
        patientService.findPatient(id).setDateIn(dayIn);
        patientService.findPatient(id).setDateOut(dayOut);
        patientService.findPatient(id).setNumberOfMeals(numberOfMeals);
        patientService.upDate();
    }

    private static void payHospitalFees() {
        patientService.printFull();
    }

    private static void inputCost() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id mà bạn muốn thêm");
        int id = scanner.nextInt();
        scanner.nextLine();
        String dayIn ;
        do {
            System.out.println("Nhập ngày vào viện");
            dayIn = scanner.nextLine();
        }while (patientService.checkDate(dayIn) == false);

        String dayOut;
        do {
            System.out.println("Nhập ngày ra viện");
            dayOut = scanner.nextLine();
        } while (patientService.checkDate(dayOut) == false);
        System.out.println("Nhập số buổi ăn");
        int numberOfMeals = scanner.nextInt();
        scanner.nextLine();
        patientService.findPatient(id).setDateIn(dayIn);
        patientService.findPatient(id).setDateOut(dayOut);
        patientService.findPatient(id).setNumberOfMeals(numberOfMeals);
        patientService.upDate();
    }

    private static void loadDBPatient() {
        patientService.print();
    }

    private static void findPatient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id bệnh nhân mà bạn muốn xem thông tin");
        int id = scanner.nextInt();
        scanner.nextLine();
        if (patientService.findPatient(id)!=null) {
            System.out.println(patientService.findPatient(id));
        } else {
            System.out.println("Không tồn tại");
        }
    }

    private static void deletePatient() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id bệnh nhân mà bạn muốn xóa");
        int id = scanner.nextInt();
        if (patientService.findPatient(id)!=null) {
            patientService.removePatient(id);
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Không tồn tại");
        }
    }

    private static void editPatient() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id bệnh nhân mà bạn muốn sửa");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println(patientService.findPatient(id));
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập giới tính");
        String gender = scanner.nextLine();
        String phoneNumber;
        do {
            System.out.println("Nhập số điện thoại");
            phoneNumber = scanner.nextLine();
            while (patientService.findExists(phoneNumber) != null) {
                System.out.println("Số điện thoại đã có,vui lòng nhập lại");
                phoneNumber = scanner.nextLine();
            }
        } while (!patientService.checkPhoneNumber(phoneNumber));
        System.out.println("Nhập quê quán");
        String homeTown = scanner.nextLine();
        patientService.findPatient(id).setName(name);
        patientService.findPatient(id).setGender(gender);
        patientService.findPatient(id).setAge(age);
        patientService.findPatient(id).setPhoneNumber(phoneNumber);
        patientService.findPatient(id).setHomeTown(homeTown);
        patientService.upDate();
    }

    private static void addPatient() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập giới tính");
        String gender = scanner.nextLine();
        String phoneNumber;
        do {
            System.out.println("Nhập số điện thoại");
            phoneNumber = scanner.nextLine();
            while (patientService.findExists(phoneNumber) != null) {
                System.out.println("Số điện thoại đã có,vui lòng nhập lại");
                phoneNumber = scanner.nextLine();
            }
        } while (!patientService.checkPhoneNumber(phoneNumber));
        System.out.println("Nhập quê quán");
        String homeTown = scanner.nextLine();
        Patient patient = new Patient(0,name,age,gender,phoneNumber,homeTown);
        patientService.addPatient(patient);
    }

    private static void creatMenu() {
        System.out.println();
        System.out.printf("%75s%s"," ","-----CHƯƠNG TRÌNH QUẢN LÝ BỆNH NHÂN-----");
        System.out.println();
        System.out.printf("%77s%s"," ","Chọn chức năng theo số để tiếp tục:");
        System.out.println();
        for (int i = 0; i < 181; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("|    %s    |","1. Thêm mới");
        System.out.printf("   %s   |","2. Sửa thông tin");
        System.out.printf("    %s    |","3. Xóa");
        System.out.printf("    %s    |","4. Tìm kiếm");
        System.out.printf("   %s   |","5. In thông tin");
        System.out.printf("   %s   |","6. Nhập chi phí");
        System.out.printf("   %s   |","7. Sửa chi phí");
        System.out.printf("   %s   |","8. Thanh toán");
        System.out.printf("    %s    |","9. Thoát");
        System.out.println();
        for (int i = 0; i < 181; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("Chọn chức năng:");
    }
}
