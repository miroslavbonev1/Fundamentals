package MethodsExercise;

import java.util.Scanner;

public class P03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);
        valueOfCharacter(firstSymbol,secondSymbol);
    }
    public static void valueOfCharacter(char a, char b){
        if (a < b){
            for (char i =(char) (a + 1); i < b ; i++) {
                System.out.print(i + " ");
            }
        }else {
            for (char i =(char)( b + 1); i < a ; i++) {
                System.out.print(i + " ");
            }
        }

    }
}
