package MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class blank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstInput = scanner.nextLine();
        int[] secondInput = Arrays.stream(firstInput.split(">>"))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(secondInput);

    }
}
