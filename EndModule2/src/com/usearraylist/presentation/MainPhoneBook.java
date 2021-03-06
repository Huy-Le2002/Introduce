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
                    System.out.println("Nh???p v??o kh??ng h???p l???");
                    break;
            }
        } while (choose != 8);
    }

    private static void saveFile() throws IOException {
        System.out.println("B???n ???? l??u th??nh c??ng");
        phoneBookService.updateFile();
    }

    private static void readFile() throws IOException {
        phoneBookService.loadFile();
        System.out.println("?????c file th??nh c??ng");
    }

    private static void findPhoneBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nh???p v??o s??? ??i???n tho???i mu???n t??m");
        String phone = scanner.nextLine();
        System.out.println(phoneBookService.findByPhone(phone).toString());
    }

    private static void removePhoneBook() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nh???p v??o s??? ??i???n tho???i mu???n x??a");
        String phone = scanner.nextLine();
        if (phoneBookService.findByPhone(phone) != null) {
            PhoneBookDB.phoneBookArrayList.remove(phoneBookService.findByPhone(phone));
            System.out.println("???? x??a th??nh c??ng");
        } else {
            System.out.println("X??a kh??ng th??nh c??ng");
        }

    }

    private static void editPhoneBook() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nh???p s??? ??i???n tho???i m?? b???n mu???n s???a");
        String tel = scanner.nextLine();
        if (phoneBookService.findByPhone(tel) != null) {
            System.out.println(phoneBookService.findByPhone(tel));
            System.out.println("Nh???p nh??m danh b???:");
            String group = scanner.nextLine();
            System.out.println("H??? t??n");
            String name = scanner.nextLine();
            System.out.println("Gi???i t??nh");
            String gender = scanner.nextLine();
            System.out.println("?????a ch???");
            String address = scanner.nextLine();
            System.out.println("Ng??y sinh");
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
            System.out.println("Kh??ng t???n t???i s??? ??i???n tho???i tr??n");
        }
    }

    private static void addPhoneBook() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String tel;
        do {
            System.out.println("Nh???p s??? ??i???n tho???i: ");
            tel = scanner.nextLine();
            while (phoneBookService.findExists(tel) != null) {
                System.out.println("S??t ???? t???n t???i, vui l??ng nh???p l???i");
                tel = scanner.nextLine();
            }
        }while (!phoneBookService.checkPhoneNumber(tel));

        System.out.println("Nh???p nh??m danh b???");
        String group = scanner.nextLine();
        System.out.println("Nh???p h??? t??n");
        String name = scanner.nextLine();
        System.out.println("Gi???i t??nh");
        String gender = scanner.nextLine();
        System.out.println("?????a ch???");
        String address = scanner.nextLine();
        System.out.println("Ng??y sinh");
        String dab = scanner.nextLine();
        String email ;
        do {
            System.out.println("Nh???p email: ");
            email = scanner.nextLine();
            while (phoneBookService.findExists(email) != null) {
                System.out.println("???? t???n t???i email. Vui l??ng nh???p l???i");
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
        System.out.println("-----CH????NG TR??NH QU???N L?? DANH B???-----");
        System.out.println("Ch???n ch???c n??ng theo s??? ????? ti???p t???c:");
        System.out.println("1. Xem danh s??ch");
        System.out.println("2. Th??m m???i");
        System.out.println("3. C???p nh???t");
        System.out.println("4. X??a");
        System.out.println("5. T??m ki???m");
        System.out.println("6. ?????c t??? file");
        System.out.println("7. Ghi v??o file");
        System.out.println("8. Tho??t");
        System.out.println("Ch???n ch???c n??ng:");
    }
}
