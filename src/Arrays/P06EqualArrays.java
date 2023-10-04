package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstSequence = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int[] secondSequence = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        boolean identical = true;
        int sum = 0;
        for (int i = 0; i < firstSequence.length; i++) {
            sum += firstSequence[i];
            if(firstSequence[i] != secondSequence[i]){
                System.out.printf("Arrays are not identical. Found difference at %d index.%n",i);
                identical = false;
                break;
            }
        }
        if(identical){
            System.out.printf("Arrays are identical. Sum: %d%n",sum);
        }

    }
}
