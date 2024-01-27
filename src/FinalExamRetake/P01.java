package FinalExamRetake;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String output = "";
        String input = scanner.nextLine();
        StringBuilder text = new StringBuilder(output);
        while (!input.equals("End")){
            String[] inputParts = input.split(" ");
            String command = inputParts[0];
            switch (command){
                case "Add":
                    String substring = inputParts[1];
                    output = output + substring;
                    break;
                case "Upgrade":
                    String givenChar = inputParts[1];
                    char symbol = givenChar.toCharArray()[0];
                    int value = Integer.valueOf(symbol);
                    int newCharacter = value + 1;
                    char replacedCharacter = Character.forDigit(value,value + 1);
                    text = new StringBuilder(text.toString().replaceAll(givenChar, String.valueOf(replacedCharacter)));
                 /*   output.replace(givenChar,replacedCharacter);*/
                    break;
                case "Print":
                    System.out.println(output);
                    break;
                case "Index":
                    List<Integer> placesOfTheChar = new ArrayList<>();
                    String newChar = inputParts[1];
                    char wantedChar = newChar.charAt(0);
                    for (int i = 0; i < output.length(); i++) {
                        char currentChar = output.charAt(i);
                        if (currentChar == wantedChar){
                            int place = (int) currentChar;
                            placesOfTheChar.add(place);
                        }
                    }
                    if (!placesOfTheChar.isEmpty()){
                        System.out.println(placesOfTheChar.toString().replace("[","")
                                .replace("]"," "));
                    }else{
                        System.out.println("None");
                    }
                    break;
                case "Remove":
                    String remove = inputParts[1];
                    output.replaceAll(remove,"");
                    break;
                }
            input = scanner.nextLine();
        }
        }
    }

