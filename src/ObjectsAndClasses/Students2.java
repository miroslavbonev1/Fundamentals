package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        while(true){
            String line = scanner.nextLine();
            if (line.equals("end")){
                break;
            }
            String[] studentArgs = line.split(" ");
            String firstName = studentArgs[0];
            String lastName = studentArgs[1];
            int age = Integer.parseInt(studentArgs[2]);
            String hometown = studentArgs[3];
            boolean exists = false;
            for(Student student : students){
                if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                    student.setAge(age);
                    student.setHometown(hometown);
                    exists = true;
                    break;
                }
            }
            if (!exists){
                Student student = new Student(firstName,lastName,age,hometown);

                students.add(student);
            }
        }
        String filterCity = scanner.nextLine();

        for (Student student: students){
            if (student.getHometown().equals(filterCity)){
                System.out.println(student.getDetails());
            }
        }
    }
}