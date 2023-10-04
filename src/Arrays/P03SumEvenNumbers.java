package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int[] elements = Arrays.stream(scanner.nextLine().split(" "))
               .mapToInt(e -> Integer.parseInt(e))
               .toArray(); // ot string masiv v int//
       String[] numberAsStrings = Arrays.stream(elements)
               .mapToObj(e -> String.valueOf(e))
               .toArray(String[]::new); // ot int masiv v int//
        int[] numbers = new int[elements.length];

        System.out.println();
    }
}
