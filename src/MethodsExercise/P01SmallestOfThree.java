package MethodsExercise;

import java.util.Scanner;

public class P01SmallestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int result = 0;
        whichNumberIsSmaller(a,b,c);

    }
    public static void whichNumberIsSmaller(int a, int b, int c){
        System.out.println(Math.min(a,Math.min(b,c)));
    }
}
