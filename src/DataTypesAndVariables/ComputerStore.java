package DataTypesAndVariables;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double sum = 0;
        double taxes = 0;
        double priceWithoutTaxes = 0;
        while (!input.equals("regular") && !input.equals("special")) {
            double partsPrice = Double.parseDouble(input);
            if (partsPrice < 0) {
                System.out.println("Invalid price!");
            } else {
                priceWithoutTaxes += partsPrice;
                sum += partsPrice * 1.2;
                taxes = sum - priceWithoutTaxes;
            }
            input = scanner.nextLine();
        }
        if (input.equals("special")) {
            sum = sum * 0.9;
        }
        if (sum == 0) {
            System.out.println("Invalid order!");
        } else {
            System.out.printf("Congratulations you've just bought a new computer!\n" +
                    "Price without taxes: %.2f\n" +
                    "Taxes: %.2f\n" +
                    "-----------\n" +
                    "Total price: %.2f$\n", priceWithoutTaxes, taxes, sum);
        }
    }
}
