package finalExamPrep;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02AdAstra {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regex = "(#|\\|)(?<foodname>[A-Za-z\\s ]+)\\1(?<expirationDate>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]{1,5})\\1";
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(text);

        int totalCalories = 0;
        StringBuilder foodsOutput = new StringBuilder();

        while (matcher.find()) { // dokato ima neshta v matcher mi napravi tova
            String foodName = matcher.group("foodname");
            String expirationDate = matcher.group("expirationDate");
            int calories = Integer.parseInt(matcher.group("calories"));

            totalCalories += calories;
            String output = String.format("Item: %s, Best before: %S, Nutrition: %d%n",foodName,expirationDate,calories);
            foodsOutput.append(output);
        }

        int days = totalCalories / 2000;
        System.out.printf("You have food to last you for: %d days!%n",days);
        System.out.println(foodsOutput);
    }
}
