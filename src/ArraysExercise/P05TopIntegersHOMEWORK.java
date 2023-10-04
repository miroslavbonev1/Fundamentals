package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegersHOMEWORK {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();

    for (int i = 0; i <= numbersArr.length - 1; i++) {
        boolean isBigger = true;
        int maxNumber = Integer.MIN_VALUE;
        int currentNum = numbersArr[i];
        for (int j = numbersArr.length - 1; j >= i; j--) {
            int currentNum2 = numbersArr[j];
            if (currentNum >= currentNum2) {
                maxNumber = currentNum;
            } else {
                isBigger = false;
                break;
            }
        }
        if (isBigger) {
            System.out.print(currentNum + " ");
        }
    }
}
}