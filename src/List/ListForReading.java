package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListForReading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputElements = scanner.nextLine().split(" ");
        List<Integer> nums = new ArrayList<>();
        for (String element : inputElements){
            nums.add(Integer.parseInt(element));
        }
    }
}
