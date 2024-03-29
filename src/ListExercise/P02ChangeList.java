package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("end")){
            if (command.contains("Delete")){
                int numberForDelete = Integer.parseInt(command.split(" ")[1]);
                numbers.removeAll(Arrays.asList(numberForDelete));
            }else if (command.contains("Insert")){
                int numberForAdding = Integer.parseInt(command.split(" ")[1]);
                int position = Integer.parseInt(command.split(" ")[2]);
                numbers.add(position,numberForAdding);
            }
            command = scanner.nextLine();
        }
        for ( int number : numbers){
            System.out.print(number + " ");
        }
    }
}
