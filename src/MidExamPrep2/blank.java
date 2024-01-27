package MidExamPrep2;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class blank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());
        System.out.println(numbers.size());
    }
}
