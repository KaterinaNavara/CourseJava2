package taskStudent;

import java.time.LocalDate;

public class Student {
    private int id;
    private String lastName;
    private String name;
    private String fathersName;
    private LocalDate dateBirthday;
    private String address;
    private String phoneNumber;
    private String faculty;
    private int course;
    private String group;



    public Student(String lastName, String name, LocalDate dateBirthday, String faculty, int course) {
        this.lastName = lastName;
        this.name = name;
        this.dateBirthday = dateBirthday;
        this.faculty = faculty;
        this.course = course;
        this.group = faculty + course;
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

    public LocalDate getDateBirthday() {
        return dateBirthday;
    }

    public void setDateBirthday(LocalDate dateBirthday) {
        this.dateBirthday = dateBirthday;
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

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "studentPackege.Student{" +
                "lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", dateBirthday=" + dateBirthday +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group=" + group +
                '}';
    }
}

