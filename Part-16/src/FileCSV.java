import java.io.*;
import java.util.ArrayList;

public class FileCSV {
    public String l1,l2,l3,l4,l5,l6;

    public FileCSV(String l1, String l2, String l3, String l4, String l5, String l6) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.l4 = l4;
        this.l5 = l5;
        this.l6 = l6;
    }

    public String getL1() {
        return l1;
    }

    public void setL1(String l1) {
        this.l1 = l1;
    }

    public String getL2() {
        return l2;
    }

    public void setL2(String l2) {
        this.l2 = l2;
    }

    public String getL3() {
        return l3;
    }

    public void setL3(String l3) {
        this.l3 = l3;
    }

    public String getL4() {
        return l4;
    }

    public void setL4(String l4) {
        this.l4 = l4;
    }

    public String getL5() {
        return l5;
    }

    public void setL5(String l5) {
        this.l5 = l5;
    }

    public String getL6() {
        return l6;
    }

    public void setL6(String l6) {
        this.l6 = l6;
    }

    @Override
    public String toString() {
        return l1 +
                "," + l2 +
                "," + l3 +
                "," + l4 +
                "," + l5 +
                "," + l6 +"\n";
    }
    public static ArrayList readFile(String path) throws IOException {
        File file = new File(path);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        ArrayList<String> arr = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            String[] str = line.split(",");
            for (int i = 0; i < str.length ; i++) {
                arr.add(str[i]);
            }
            arr.add("\n");

        } return arr;
    }
    public static void main(String[] args) throws IOException {
        FileCSV fileCSV = new FileCSV("1.0.0.0","1.0.0.255","16777216","16777471","AU","Australia");
        FileCSV fileCSV1 = new FileCSV("1.0.1.0","1.0.3.255","16777472","16778239","CN","China");
        FileCSV fileCSV2 = new FileCSV("1.0.0.0","1.0.0.255","16777216","16777471","AU","Australia");
        FileCSV fileCSV3 = new FileCSV("1.0.0.0","1.0.0.255","16777216","16777471","AU","Australia");
        FileCSV fileCSV4 = new FileCSV("1.0.16.0","1.0.31.255","16781312","16785407","JP","Japan");
        FileCSV fileCSV5 = new FileCSV("1.0.0.0","1.0.0.255","16777216","16777471","AU","Australia");
        FileCSV fileCSV6 = new FileCSV("1.0.0.0","1.0.0.255","16777216","16777471","AU","Australia");
        FileCSV fileCSV7 = new FileCSV("1.0.128.0","1.0.255.255","16809984","16842751","TH","Thailand");

        ArrayList<FileCSV> country = new ArrayList<>();
            country.add(fileCSV);
            country.add(fileCSV1);
            country.add(fileCSV2);
            country.add(fileCSV3);
            country.add(fileCSV4);
            country.add(fileCSV5);
            country.add(fileCSV6);
            country.add(fileCSV7);

        try {
            File file = new File("D:\\fileCG\\MODULE 2\\Part-16\\CSV.csv");
            FileWriter fw = new FileWriter(file);
            for (FileCSV c: country) {
                fw.append(c.toString());
            }
            fw.close();
            System.out.println("ok");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(readFile("D:\\fileCG\\MODULE 2\\Part-16\\CSV.csv"));
    }
}
