package Arrays;

import java.util.Scanner;

public class P01Days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(days[number - 1]);
        if (number > 7 && number < 1 ){
            System.out.print("Invalid Day!");
        }
    }
}
