package ObjectAndClassesExercise.OpinionPoll_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> peopleList = new ArrayList<>();
        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();
            String[] inputArgs = input.split(" ");
            String name = inputArgs[0];
            int age = Integer.parseInt(inputArgs[1]);
            if (age > 30){
                Person person = new Person(name,age);
                peopleList.add(person);

            }
        }
        for (Person person : peopleList){
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
