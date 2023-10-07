package Methods;

import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            int evenSum = sumEvenDigits(number);
            int oddSum = sumOddDigits(number);
            int result = evenSum * oddSum;
            System.out.println(result);
        }

        scanner.close();
    }

    public static int sumEvenDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    public static int sumOddDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }
}
