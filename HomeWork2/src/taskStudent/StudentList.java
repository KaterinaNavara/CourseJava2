package taskStudent;

import java.util.Arrays;

public class StudentList {
    private Student[] studentsList;
    private int count;

    public StudentList() {
        studentsList = new Student[10];
        count = -1;
    }

    public void add(Student student) {
        if (count == studentsList.length-1) {
            studentsList = Arrays.copyOf(studentsList, studentsList.length*2);
        }
        studentsList[++count] = student;
    }

    public Student studentGet(int i) {
        return studentsList[i];
    }

    public int size() {
        return count+1;
    }

    public void printAllStudents(){
        System.out.println("Список всех студентов");
        for (int i = 0; i < size(); i++) {
            System.out.println(studentsList[i]);

        }
    }

    public void printStudentsByFaculty(String faculty) {
        System.out.println("Список студентов факультета " + faculty);
        for (int i = 0; i < size() ; i++) {
            if (studentsList[i].getFaculty().equals(faculty)){
                System.out.println(studentsList[i]);
            }

        }
    }

    public String[] allFaculty() {

        String[] faculties = new String[studentsList.length];

        int currentPosition = 0; // текущая свободная позиция в массиве факультетов

        for (int i = 0; i < studentsList.length; i++) {
            if (studentsList[i] != null) {
                String faculty = studentsList[i].getFaculty();

                boolean facultyExists = false;

                for (int j = 0; j < currentPosition; j++) {
                    if (faculties[j].equals(faculty)) {
                        facultyExists = true;
                        break;
                    }
                }

                if (!facultyExists) {
                    faculties[currentPosition++] = faculty;
                }
            }
        }

        return faculties;
    }

    public void printStudentsByAllFaculty(){
        for (int i = 0; i <allFaculty().length ; i++) {
            if(allFaculty()[i] != null) {
                System.out.println("Список студентов факультета " + allFaculty()[i]);
                for (int j = 0; j < size(); j++) {
                    if (studentsList[j].getFaculty().equals(allFaculty()[i])) {
                        System.out.println(studentsList[j]);
                    }

                }
            }
        }
    }

    public int[] allCourses () {
        int[] courses = new int[size()];
        int currentPosition = 0;
        for (int i = 0; i < studentsList.length; i++) {
            if (studentsList[i] != null) {
                int cours = studentsList[i].getCourse();

                boolean coursesExists = false;

                for (int j = 0; j < currentPosition; j++) {
                    if (courses[j] == cours) {
                        coursesExists = true;
                        break;
                    }
                }

                if (!coursesExists) {
                    courses[currentPosition++] = cours;
                }
            }
        }
        return courses;
    }


    public void printStudentsByAllCourses(){
        for (int i = 0; i <allCourses().length ; i++) {
            if(allCourses()[i] != 0) {
                System.out.println("Список студентов " + allCourses()[i] + " курса");
                for (int j = 0; j < size(); j++) {
                    if (studentsList[j].getCourse() == allCourses()[i]) {
                        System.out.println(studentsList[j]);
                    }

                }
            }
        }
    }

    public void printStudentsBornAfterEnteredYear(int year) {
        System.out.println("Список студентов, родившихся после " + year + " года");
        for (int i = 0; i <size() ; i++) {
            if (year < studentsList[i].getDateBirthday().getYear()) {
                System.out.println(studentsList[i]);
            }


        }


    }

    public void printStudentsOfGroupEntered(String group) {
        System.out.println("Список студентов группы " + group.toUpperCase());
        for (int i = 0; i <size() ; i++) {
            if (studentsList[i].getGroup().equalsIgnoreCase(group)){
                System.out.println(studentsList[i]);
            }

        }
    }



}
