package taskPatient;

import java.util.Arrays;

public class PatientList {
    private Patient[] patientsList;
    private int count;

    public PatientList() {
        patientsList = new Patient[10];
        count = -1;
    }

    public void addPatient(Patient patient) {
        if (patientsList.length == count - 1) {
            patientsList = Arrays.copyOf(patientsList, patientsList.length * 2);
        }
        patientsList[++count] = patient;
    }

    public Patient patientGet(int i) {
        return patientsList[i];
    }

    public int size() {
        return count + 1;
    }

    public void printAllPatient() {
        System.out.println("Список всех пациентов");
        for (int i = 0; i < size(); i++) {
            System.out.println(patientsList[i]);

        }
    }


    public void printPatientByDiagnosis(String diagnosis) {
        System.out.println("Список пациентов с диагнозом " + diagnosis);
        for (int i = 0; i < size(); i++) {
            if (patientsList[i].getDiagnosis().equals(diagnosis)) {
                System.out.println(patientsList[i]);
            }

        }

    }

    public void printPatientsWithCardNumberInEnteredInterval(int x, int y) {
        if(x <= y) {
            System.out.println("Список пациентов, у которых номера карт находятся в интервале от " + x + " до " + y);
        }
        else {
            System.out.println("Список пациентов, у которых номера карт находятся в интервале от " + y + " до " + x);
        }
        for (int i = 0; i <size() ; i++) {

            if (patientsList[i].getMedicalCardNumber() >= x && patientsList[i].getMedicalCardNumber() <= y) {
                    System.out.println(patientsList[i]);
                }
                else {

                if (patientsList[i].getMedicalCardNumber() <= x && patientsList[i].getMedicalCardNumber() >= y) {
                    System.out.println(patientsList[i]);
                }
            }

        }

    }

}

