package MethodsExercise;

import java.util.Scanner;

public class P10TopInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            boolean isValidSumDigits = checkSumDigitsIsDevidedBy8(n);
            boolean isContainsOddDigit = checkNumberOddDigit(n);

            if(isContainsOddDigit && isValidSumDigits){
                System.out.println(i);
            }
        }
    }
    public static boolean checkSumDigitsIsDevidedBy8 (int number) {
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }
        if (sum / 8 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean checkNumberOddDigit (int number){
        while(number > 0){
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0){
                return true;
            }else{
                number /=10;
            }
        }
        return false;
    }
}
