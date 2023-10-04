package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class trainsP01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wagons = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int currentWagon = 0;
        for (int i = 1; i < wagons; i++) {
            int[] totalPeople = Arrays.stream(scanner.nextLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();
            sum += totalPeople[i];
            System.out.print(totalPeople[i] + " ");
        }
        System.out.println(sum);
    }
}
