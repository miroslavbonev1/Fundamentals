package ListExercise;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;

public class P04ListOperatorsCloseToEXAM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());
        String command = scanner.nextLine();
        while(!command.equals("End")){
            if (command.contains("Add")){
                int numberToAdd = Integer.parseInt(command.split(" ")[1]);
                numbers.add(numberToAdd);
            }
            else if(command.contains("Insert")){
                int numberToInsert = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);
                if (index >= 0 && index <= numbers.size() - 1){
                    numbers.add(index,numberToInsert);
                }else {
                    System.out.println("Invalid index");
                }
            }
            else if(command.contains("Remove")){
                int index = Integer.parseInt(command.split(" ")[1]);
                if (index >= 0 && index <= numbers.size() - 1){
                    numbers.remove(index);
                }else {
                    System.out.println("Invalid index");
                }
            }
            else if(command.contains("Shift left")){
                int countShiftLeft = Integer.parseInt(command.split(" ")[2]);
                for (int i = 0; i < countShiftLeft; i++) {
                    int firstElement = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(firstElement);
                }
            }
            else if(command.contains("Shift right")){
                int countShiftRight = Integer.parseInt(command.split(" ")[2]);
                for (int i = 0; i < countShiftRight; i++) {
                    int lastElement = numbers.get(numbers.size() - 1);
                    numbers.remove(numbers.size() - 1);
                    numbers.add(0 , lastElement);
                }
            }
            command = scanner.nextLine();
        }
        for (int number : numbers){
            System.out.print(number + " ");
        }
    }
}
