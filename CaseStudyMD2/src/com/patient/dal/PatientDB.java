package com.patient.dal;

import com.patient.model.Patient;

import java.io.*;
import java.util.ArrayList;

public class PatientDB {
    public static ArrayList<Patient> patientArrayList = new ArrayList<>();
    public static int count;
    static {
        count = 0;
    }
    public void saveFile() throws IOException {
        File file = new File("PatientDB.csv");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream("PatientDB.csv");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        for (int i = 0; i < patientArrayList.size(); i++) {
            bufferedOutputStream.write(patientArrayList.get(i).toStringCSV().getBytes());
        }
        bufferedOutputStream.flush();
        fileOutputStream.close();
    }
    public void readFile() throws IOException {
        File file = new File("PatientDB.csv");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileReader fileReader = new FileReader("PatientDB.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] arr = line.split(",");
            Patient patient = new Patient(Integer.parseInt(arr[0]),arr[1],Integer.parseInt(arr[2]),arr[3],arr[4],arr[5],arr[6],arr[7],Integer.parseInt(arr[8]),Long.parseLong(arr[9]));
            add(patient);
        }
    }

    public void add(Patient patient) {
        count++;
        patient.setId(count);
        patientArrayList.add(patient);
    }
}
