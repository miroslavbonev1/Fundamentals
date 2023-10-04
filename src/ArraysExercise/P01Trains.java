package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P01Trains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Homework 1 ,5 , 10 youtube
/*
        moje s masiv moje i bez
*/
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            int[] passengers = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer :: parseInt)
                    .toArray();
            for (int index = 0; index <= passengers.length - 1 ; index++) {
                sum += passengers[index];
            }
        }
        System.out.println(sum);
    }
}
