package MethodsExercise;

import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();
        checksCurrentLetter(text);
    }
    public static void checksCurrentLetter (String text){
        int countVowels = 0;
        for (int i = 0; i < text.length(); i++) {
            String currentChar = String.valueOf(text.charAt(i));
            char[] letter = text.toCharArray(); // Как да направим чар от всяка буква в една дума или масив !
            if (currentChar.equals("a")){
                countVowels ++;
            } else if (currentChar.equals("e")) {
                countVowels ++;
            } else if (currentChar.equals("i")) {
                countVowels ++;
            } else if (currentChar.equals("o")) {
                countVowels ++;
            } else if (currentChar.equals("u")) {
                countVowels ++;
            }
        }
        System.out.println(countVowels);
    }
}
