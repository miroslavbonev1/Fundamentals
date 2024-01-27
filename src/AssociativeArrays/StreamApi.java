package AssociativeArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StreamApi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(53);
        nums.add(2);
        nums.add(1);
        double avg = nums.stream().mapToInt(Integer::valueOf).sum();
        int sum = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sum();
        double average = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .average()
                .getAsDouble();
        System.out.println(sum);
        System.out.println(average);
        System.out.println(avg);
    }

}
