package ArraysExercise;

import java.util.Scanner;
import java.util.Arrays;

public class P07Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        int countWinCurrent = 0;
        int countWinPrevious = 0;
        int currentNum = 0;
        int equal = 0;
        int integer = 0;
        for (int index = 0; index < numbers.length - 1; index++) {
            boolean isTrue = currentNum == numbers[index - 1];
            currentNum = numbers[index];
            if (isTrue){
                equal ++;
                integer = currentNum;
                countWinCurrent ++;
                if (countWinCurrent > countWinPrevious){
                    countWinPrevious = countWinCurrent;
                    integer = numbers[index];
                }
            }else{
                continue;
            }
        }
        for (int i = 0; i <= equal; i++) {
            System.out.print(integer + " ");
        }
    }
}
