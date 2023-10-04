package Arrays;

import java.util.Scanner;

public class p02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[] number = new int[size];
        for (int i = 0; i < number.length; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            number[i] = currentNumber;
        }
        System.out.println();
    }
}
