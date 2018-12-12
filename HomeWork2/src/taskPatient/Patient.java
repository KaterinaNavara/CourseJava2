package taskPatient;



public class Patient {
    private int id;
    private String lastName;
    private String name;
    private String fathersName;
    private String address;
    private String phoneNumber;
    private int medicalCardNumber;
    private String diagnosis;

    public Patient(int id, String lastName, String name, String fathersName, String address, String phoneNumber, int medicalCardNumber, String diagnosis) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.fathersName = fathersName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.medicalCardNumber = medicalCardNumber;
        this.diagnosis = diagnosis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getMedicalCardNumber() {
        return medicalCardNumber;
    }

    public void setMedicalCardNumber(int medicalCardNumber) {
        this.medicalCardNumber = medicalCardNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", fathersName='" + fathersName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", medicalCardNumber=" + medicalCardNumber +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}


