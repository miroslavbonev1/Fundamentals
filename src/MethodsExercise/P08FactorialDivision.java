package MethodsExercise;

import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        long factorialFirst = numberFactorial(firstNum);
        long factorialSecond = numberFactorial(secondNum);
        double result = factorialFirst * 1.0 / factorialSecond;
        System.out.printf("%.2f",result);
    }
    public static long numberFactorial(int first){
        long fact = 1;
        for (int i = 1; i <= first ; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
