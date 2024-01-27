package MidExamPrep2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03HeartHouses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("@"))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());
        String input = scanner.nextLine();
        int lastPosition = 0;
        int lastPositionIdx = 0;
        boolean hadValentinesDay = false;
        while(!input.equals("Love!")){
            String [] inputArray = input.split(" ");
            int jumpLength = Integer.parseInt(inputArray[1]);
            jumpLength +=lastPosition;
            if (hadValentinesDay) {
                System.out.printf("Place %d already had Valentine's day.%n", numbers.indexOf(jumpLength));
            }else {
                if (jumpLength > numbers.size()) {
                    numbers.set(0, numbers.get(0) - 2);
                    jumpLength = 0;
                    if (numbers.get(jumpLength) == 0) {
                        System.out.printf("Place %d has Valentine's day.%n", numbers.indexOf(jumpLength));
                        hadValentinesDay = true;
                    }
                } else {

                    numbers.set(jumpLength, numbers.get(jumpLength) - 2);
                    if (numbers.get(jumpLength) == 0) {
                        System.out.printf("Place %d has Valentine's day.%n", numbers.indexOf(jumpLength));
                        hadValentinesDay = true;
                    }
                }
            }
            lastPosition = jumpLength + lastPosition;
            input = scanner.nextLine();
        }
        lastPositionIdx = numbers.indexOf(lastPosition);
        int sum = 0;
        int countHouses = 0;
        for (int number : numbers){
            sum += number;
            if (number != 0){
                countHouses ++;
            }
        }
        System.out.printf("Cupid's last position was %d.%n", lastPosition);
        if (sum == 0){
            System.out.println("Mission was successful.");
        }else{
            System.out.printf("Cupid has failed %d places.%n",countHouses);
        }
        for ( int number : numbers ){
            System.out.print(number + " ");
        }

    }
}
