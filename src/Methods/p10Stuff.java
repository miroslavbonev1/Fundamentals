package Methods;

import java.util.Scanner;

public class p10Stuff {


    public class EvenOddDigits {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                String numberString = Integer.toString(Math.abs(number)); // Convert to positive and then to string

                for (int i = 0; i < numberString.length(); i++) {
                    char digitChar = numberString.charAt(i);
                    int digit = Character.getNumericValue(digitChar);

                    if (digit % 2 == 0) {
                        System.out.println(digit + " is even");
                    } else {
                        System.out.println(digit + " is odd");
                    }
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
            }

            scanner.close();
        }
    }
}
