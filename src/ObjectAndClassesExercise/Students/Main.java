package ObjectAndClassesExercise.Students;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countStudents = Integer.parseInt(scanner.nextLine());
        List<Student> studentsList = new ArrayList<>();
        for (int i = 1; i <= countStudents; i++) {
            String studentInfo = scanner.nextLine();
            String firstName = studentInfo.split(" ")[0];
            String lastName = studentInfo.split(" ")[1];
            double grade = Double.parseDouble(studentInfo.split(" ")[3]);

            Student student = new Student(firstName,lastName,grade);
            studentsList.add(student);
        }
        Collections.sort(studentsList, Comparator.comparingDouble(Student::getGrade)
                                                    .reversed());
        for (Student student: studentsList){
            System.out.printf("%s %s: %.2f%n",student.getFirstName(),student.getLastName(),student.getGrade());
        }
    }
}
