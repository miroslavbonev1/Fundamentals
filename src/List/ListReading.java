package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListReading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());
        String[] namesArray = names.toArray(String[]::new);
        /*!!!!!!!!!!!!!!za stringove; */
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList()); // za Integer !!!!!!!!!!!!!!!
        int[] nums = numbers.stream().mapToInt(e->e).toArray();
    }
}
