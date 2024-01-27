package MethodsExercise;

import java.util.Scanner;

public class P05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int sum = sum(a,b);
        int diff = subtract(sum,c);
        System.out.println(diff);
    }
    public static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static int subtract (int n1, int n2){
        return n1 - n2;
    }
}
