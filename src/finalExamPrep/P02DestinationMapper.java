package finalExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String allDestinations = scanner.nextLine();
        String regex = "([=\\/])(?<destination>[A-Z][a-zA-Z]{2,})\\1";
        //(?<beginning>[=\\/])(?<destination>[A-Z][A-Za-z]{2,})\\1
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(allDestinations);
        List<String> validDestinations = new ArrayList<>();

        while(matcher.find()) {
            //matcher.group -> "=Hawai=" -> "destination" -> "Hawai"
            String destination = matcher.group("destination");
            validDestinations.add(destination);
        }

        System.out.println("Destinations: " + String.join(", ", validDestinations));

        int travelPoints = 0;
        for (String destination : validDestinations) {
            travelPoints += destination.length();
        }

        System.out.println("Travel Points: " + travelPoints);


    }
}
