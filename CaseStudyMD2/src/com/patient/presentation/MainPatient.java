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
                    System.out.println("Nh???p v??o kh??ng ph?? h???p");
                    break;
            }
        } while (choose != 9);
    }

    private static void editCost() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nh???p id m?? b???n mu???n s???a chi ph??");
        int id = scanner.nextInt();
        scanner.nextLine();
        String dayIn ;
        do {
            System.out.println("Nh???p ng??y v??o vi???n");
            dayIn = scanner.nextLine();
        }while (patientService.checkDate(dayIn) == false);

        String dayOut;
        do {
            System.out.println("Nh???p ng??y ra vi???n");
            dayOut = scanner.nextLine();
        } while (patientService.checkDate(dayOut) == false);
        System.out.println("Nh???p s??? bu???i ??n");
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
        System.out.println("Nh???p id m?? b???n mu???n th??m");
        int id = scanner.nextInt();
        scanner.nextLine();
        String dayIn ;
        do {
            System.out.println("Nh???p ng??y v??o vi???n");
            dayIn = scanner.nextLine();
        }while (patientService.checkDate(dayIn) == false);

        String dayOut;
        do {
            System.out.println("Nh???p ng??y ra vi???n");
            dayOut = scanner.nextLine();
        } while (patientService.checkDate(dayOut) == false);
        System.out.println("Nh???p s??? bu???i ??n");
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
        System.out.println("Nh???p id b???nh nh??n m?? b???n mu???n xem th??ng tin");
        int id = scanner.nextInt();
        scanner.nextLine();
        if (patientService.findPatient(id)!=null) {
            System.out.println(patientService.findPatient(id));
        } else {
            System.out.println("Kh??ng t???n t???i");
        }
    }

    private static void deletePatient() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nh???p id b???nh nh??n m?? b???n mu???n x??a");
        int id = scanner.nextInt();
        if (patientService.findPatient(id)!=null) {
            patientService.removePatient(id);
            System.out.println("X??a th??nh c??ng");
        } else {
            System.out.println("Kh??ng t???n t???i");
        }
    }

    private static void editPatient() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nh???p id b???nh nh??n m?? b???n mu???n s???a");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println(patientService.findPatient(id));
        System.out.println("Nh???p t??n");
        String name = scanner.nextLine();
        System.out.println("Nh???p tu???i");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nh???p gi???i t??nh");
        String gender = scanner.nextLine();
        String phoneNumber;
        do {
            System.out.println("Nh???p s??? ??i???n tho???i");
            phoneNumber = scanner.nextLine();
            while (patientService.findExists(phoneNumber) != null) {
                System.out.println("S??? ??i???n tho???i ???? c??,vui l??ng nh???p l???i");
                phoneNumber = scanner.nextLine();
            }
        } while (!patientService.checkPhoneNumber(phoneNumber));
        System.out.println("Nh???p qu?? qu??n");
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
        System.out.println("Nh???p t??n");
        String name = scanner.nextLine();
        System.out.println("Nh???p tu???i");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nh???p gi???i t??nh");
        String gender = scanner.nextLine();
        String phoneNumber;
        do {
            System.out.println("Nh???p s??? ??i???n tho???i");
            phoneNumber = scanner.nextLine();
            while (patientService.findExists(phoneNumber) != null) {
                System.out.println("S??? ??i???n tho???i ???? c??,vui l??ng nh???p l???i");
                phoneNumber = scanner.nextLine();
            }
        } while (!patientService.checkPhoneNumber(phoneNumber));
        System.out.println("Nh???p qu?? qu??n");
        String homeTown = scanner.nextLine();
        Patient patient = new Patient(0,name,age,gender,phoneNumber,homeTown);
        patientService.addPatient(patient);
    }

    private static void creatMenu() {
        System.out.println();
        System.out.printf("%75s%s"," ","-----CH????NG TR??NH QU???N L?? B???NH NH??N-----");
        System.out.println();
        System.out.printf("%77s%s"," ","Ch???n ch???c n??ng theo s??? ????? ti???p t???c:");
        System.out.println();
        for (int i = 0; i < 181; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("|    %s    |","1. Th??m m???i");
        System.out.printf("   %s   |","2. S???a th??ng tin");
        System.out.printf("    %s    |","3. X??a");
        System.out.printf("    %s    |","4. T??m ki???m");
        System.out.printf("   %s   |","5. In th??ng tin");
        System.out.printf("   %s   |","6. Nh???p chi ph??");
        System.out.printf("   %s   |","7. S???a chi ph??");
        System.out.printf("   %s   |","8. Thanh to??n");
        System.out.printf("    %s    |","9. Tho??t");
        System.out.println();
        for (int i = 0; i < 181; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("Ch???n ch???c n??ng:");
    }
}
