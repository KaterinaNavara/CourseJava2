package taskStudent;


import java.time.LocalDate;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        StudentList studentList = new StudentList();
        studentList.add(new Student("Иванов", "Сергей", LocalDate.parse("2001-01-01"), "FPM", 1));
        studentList.add(new Student("Иванова", "Юлия", LocalDate.parse("2000-05-21"), "IPSA", 2));
        studentList.add(new Student("Петров", "Игорь", LocalDate.parse("1999-03-17"), "FBMI", 3));
        studentList.add(new Student("Григоров", "Алексей", LocalDate.parse("2001-07-04"), "FPM", 1));
        studentList.add(new Student("Пономарев", "Андрей", LocalDate.parse("1999-06-05"), "FBMI", 3));
        studentList.add(new Student("Климов", "Николай", LocalDate.parse("2000-03-02"), "FPM", 2));
        studentList.add(new Student("Печерова", "Кристина", LocalDate.parse("1999-07-01"), "FPM", 3));
        studentList.printStudentsByFaculty("FPM");
        studentList.printAllStudents();

        System.out.println(Arrays.toString(studentList.allFaculty()));
        studentList.printStudentsByAllFaculty();
        studentList.printStudentsByAllCourses();
        studentList.printStudentsBornAfterEnteredYear(2000);
        studentList.printStudentsOfGroupEntered("fpm1");

    }
}
