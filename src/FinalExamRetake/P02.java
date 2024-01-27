package FinalExamRetake;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "(?<begin>\\S)(?<name>[A-Za-z]+)\\1=(?<hashcode>[0-9]+)!!(?<encrypted>\\S+)";
        Pattern pattern = Pattern.compile(regex);
        List<String> result = new ArrayList<>();
        boolean isValid = true;
        while (isValid) {
            Matcher matcher = pattern.matcher(input);
            while (matcher.find()){
                int length = Integer.parseInt(matcher.group("hashcode"));
                int encryptedLength = matcher.group("encrypted").length();
                StringBuilder geohashcode = new StringBuilder(matcher.group("encrypted"));
                if (length == encryptedLength){
                    for (int i = 0; i < geohashcode.length(); i++) {
                        char current = geohashcode.charAt(i);
                        current = (char) (geohashcode.charAt(i) + length);
                        result.add(String.valueOf(current));
                    }
                    String output = String.join("",result);
                    System.out.printf("Coordinates found! %s -> %s%n",matcher.group("name")
                            ,output);
                    isValid = false;
                }
            }
            if (isValid == false) {
                break;
            }
            System.out.println("Nothing found!");
            input = scanner.nextLine();
        }
    }
}
