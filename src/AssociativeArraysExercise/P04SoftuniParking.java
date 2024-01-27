package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class P04SoftuniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> companyEmployees = new LinkedHashMap<>();

        while(!input.equals("End")){
            String companyName = input.split(" -> ")[0];
            String employeeId = input.split(" -> ")[1];






            input = scanner.nextLine();
        }
    }
}
