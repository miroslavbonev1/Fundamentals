package MidExam;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cities = Integer.parseInt(scanner.nextLine());
        int countCities = 0;
        double totalProfit = 0;
        for (int i = 0; i < cities; i++) {
            boolean isValid = true;
            double profitCurrentDay = 0;
            String nameOfCity = scanner.nextLine();
            double moneyEarned = Double.parseDouble(scanner.nextLine());
            double expenses = Double.parseDouble(scanner.nextLine());
            countCities++;
            if (countCities % 5 == 0 && isValid ){
                moneyEarned = moneyEarned * 0.9;
                isValid = false;
            }
            if (countCities % 3 == 0 && isValid){
                expenses = expenses + expenses / 2;
            }
            profitCurrentDay = moneyEarned - expenses;
            totalProfit += profitCurrentDay;
            System.out.printf("In %s Burger Bus earned %.2f leva.%n", nameOfCity,profitCurrentDay);
        }
        System.out.printf("Burger Bus total profit: %.2f leva.%n",totalProfit);
    }
}
