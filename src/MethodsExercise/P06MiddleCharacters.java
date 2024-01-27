package MethodsExercise;

import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        printMiddleChar(input);

    }

    public static void printMiddleChar (String text){
        int length = text.length();
        if (length % 2 != 0){
            System.out.println(text.charAt(length / 2));
        }else {
            // 4 simvola = abcd = 1 2
            // 2 simvola = ab = 0 1
            // 6 simvola = abcdef = 2 3
            int currentSymbol = text.length() / 2;
            System.out.print(text.charAt(currentSymbol - 1));
            System.out.print(text.charAt(currentSymbol));
        }
    }
}
