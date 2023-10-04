package Arrays;

import java.util.Scanner;

public class ArraysInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*arrays.length duljinata na masiva
        * edin vid elementi
        * ot 0 do n - 1
        * */
        int index = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[20];
        System.out.println(numbers[index]);
        System.out.println(numbers.length);
        /* split - e kogato sa razdeleni chislata => vrushta masiv ot stringove
        * steam =  arrays.stream
        * int[] elements = Arrays.stream(scanner.nextLine().split(" "))
               .mapToInt(e -> Integer.parseInt(e))
               .toArray();*/


    }

}
