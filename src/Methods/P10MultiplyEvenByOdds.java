package Methods;

import java.util.Scanner;
import java.util.Arrays;

public class P10MultiplyEvenByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = new String[]{scanner.nextLine()};
        int even = 0;
        int odd = 0;
        for (int i = 0; i <= input.length - 1; i++) {
            int currentNum = Integer.parseInt(input[i]);
            if (currentNum % 2 == 0){
                even += currentNum;
            }else{
                odd+=currentNum;
            }
        }
        int result = EvenOddSum(even,odd);
        System.out.println(result);
    }
    public static int EvenOddSum(int even, int odd){
        int result = even * odd;
        return (result);
    }
}
