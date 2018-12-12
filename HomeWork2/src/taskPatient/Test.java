package taskPatient;

public class Test {
    public static void main(String[] args) {


        PatientList patientList = new PatientList();
        patientList.addPatient(new Patient(123132, "Иванов", "Дмитрий", "Федорович", "улица Институтская 7, 65", "066-987-35-76", 1, "Бронхит"));
        patientList.addPatient(new Patient(123132, "Иванова", "Алина", "Марковна", "улица Институтская 7, 65", "066-987-35-81", 2, "Миокардит"));
        patientList.addPatient(new Patient(123132, "Петров", "Алексей", "Николаевич", "улица Кирилловская 52, 91", "068-548-71-88", 3, "Аденоидит"));
        patientList.addPatient(new Patient(123132, "Петова", "Маргарита", "Алексеевна", "улица Кирилловская 52, 91", "068-745-18-32", 4, "Бронхит"));
        patientList.addPatient(new Patient(123132, "Пономарев", "Кирилл", "Максимович", "улица Макеевская 32, 73", "095-823-54-23", 5, "Бронхит"));
        patientList.addPatient(new Patient(123132, "Пономарева", "Алексанра", "Андреевна", "улица Макеевская 32, 73", "099-912-31-63", 6, "Аденоидит"));
        patientList.addPatient(new Patient(123132, "Климов", "Юрий", "Константинович", "улица Березняковская 38, 87", "099-154-32-87", 7, "Бронхит"));
        patientList.addPatient(new Patient(123132, "Климова", "Карина", "Федоровна", "улица Березняковская 38, 87", "099-293-41-94", 8, "Аденоидит"));

        patientList.printAllPatient();
        patientList.printPatientByDiagnosis("Бронхит");
        patientList.printPatientByDiagnosis("Аденоидит");
        patientList.printPatientByDiagnosis("Миокардит");
        patientList.printPatientsWithCardNumberInEnteredInterval(2, 2);
    }
}
