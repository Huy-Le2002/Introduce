package com.patient.service;

import com.patient.dal.PatientDB;
import com.patient.model.Patient;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatientService {
    PatientDB patientDB = new PatientDB();
    public void addPatient(Patient patient) throws IOException {
        patientDB.add(patient);
        patientDB.saveFile();
    }
    public void removePatient(int id) throws IOException {
        PatientDB.patientArrayList.remove(findPatient(id));
        patientDB.saveFile();
    }
    public void loadFile() throws IOException {
        patientDB.readFile();
    }
    public void upDate() throws IOException {
        patientDB.saveFile();
    }
    public Patient findPatient(int id) {
        for (Patient patient: PatientDB.patientArrayList) {
            if (patient.getId() == id) {
               return patient;
            }
        } return null;
    }
    public Patient findExists(String number) {
        for (int i = 0; i < PatientDB.patientArrayList.size(); i++) {
            if (PatientDB.patientArrayList.get(i).getPhoneNumber().equals(number)) {
                return PatientDB.patientArrayList.get(i);
            }
        } return null;

    }
    public boolean checkPhoneNumber(String number) {
        String regex = "(84|0[3|5|7|8|9])+([0-9]{8})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);
        return matcher.find();
    }
    public void print() {
        for (int i = 0; i < PatientDB.patientArrayList.size(); i++) {
            System.out.println(PatientDB.patientArrayList.get(i).toStringInfo());
        }
    }
    public void printFull() {
        for (int i = 0; i < PatientDB.patientArrayList.size(); i++) {
            System.out.println(PatientDB.patientArrayList.get(i).toString());
        }
    }
    public boolean checkDate(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            sdf.setLenient(false);
            sdf.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
