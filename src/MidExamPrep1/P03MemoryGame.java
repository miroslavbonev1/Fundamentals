package MidExamPrep1;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;

public class P03MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .collect(Collectors.toList());
        String command = scanner.nextLine();
        int numberMoves = 0;
        int numbersSize = numbers.size();

        while (!command.equals("end")) {
            String[] commandArray = command.split(" ");
            numberMoves++;
            int index1 = Integer.parseInt(commandArray[0]);
            int index2 = Integer.parseInt(commandArray[1]);

            if (index1 == index2 || index1 < 0 || index1 > numbersSize  || index2 < 0  || index2 > numbersSize) {
                String element = "-" + numberMoves + "a";
                numbers.add(numbersSize / 2 - 1, element);
                numbers.add(numbersSize / 2 , element);
                System.out.println("Invalid input! Adding additional elements to the board");
            } else if (index1 < 0 || index2 < 0 || index1 > numbers.size() || index2 > numbers.size()){
                System.out.println("Try again!");}
            else if ((Integer.parseInt(numbers.get(index1))) == Integer.parseInt(numbers.get(index2))) {
                System.out.printf("Congrats! You have found matching elements - %d!%n", Integer.parseInt(numbers.get(index1)));
                numbers.remove(index1);
                numbers.remove(index2);
            }
            command = scanner.nextLine();
        }
        if (numbersSize == 0) {
            System.out.printf("You have won in %d turns!%n", numberMoves);
        }
        else  {
            System.out.println("Sorry you lose :(");
            System.out.println(numbers.toString()
                    .replace("[", "")
                    .replace("]", ""));
        }
    }
}
