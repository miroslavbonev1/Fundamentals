package MidExam;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstInput = scanner.nextLine().split(">>");

        int totalTax = 0;
        for (String parts : firstInput){
            String[] input = parts.split(" ");
        for (int i = 0; i < input.length - 1; i++) {
            String typeCar = String.valueOf(input[i]);
            int yearsTax = Integer.parseInt(input[i+1]);
            int kilometresTravelled = Integer.parseInt(input[i+2]);
            int taxCurrentCar = 0;
            switch (typeCar){
                case "family":
                    taxCurrentCar -= yearsTax * 5;
                    while(kilometresTravelled >= 3000){
                        kilometresTravelled -= 3000;
                        taxCurrentCar += 12;
                    }
                    taxCurrentCar += 50;
                    System.out.printf("A %s car will pay %.2f euros in taxes.%n",typeCar,taxCurrentCar * 1.0);
                    break;
                case "heavyDuty":
                    taxCurrentCar -= yearsTax * 8;
                    while(kilometresTravelled >= 9000){
                        kilometresTravelled -= 9000;
                        taxCurrentCar += 14;
                    }
                    taxCurrentCar += 80;
                    System.out.printf("A %s car will pay %.2f euros in taxes.%n",typeCar,taxCurrentCar * 1.0);
                    break;
                case "sports":
                    taxCurrentCar -= yearsTax * 9;
                    while(kilometresTravelled >= 2000){
                        kilometresTravelled -= 2000;
                        taxCurrentCar += 18;
                    }
                    taxCurrentCar += 100;
                    System.out.printf("A %s car will pay %.2f euros in taxes.%n",typeCar,taxCurrentCar * 1.0);
                    break;
                default:
                    System.out.println("Invalid car type.");
            }
            i+=3;
             totalTax += taxCurrentCar;
        }
        }
        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.%n",totalTax * 1.0);
    }
}
