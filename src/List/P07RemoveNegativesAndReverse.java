package List;

import java.util.*;

public class P07RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (String element: input){
            int number = Integer.parseInt(element);
            if (number > 0){
                numbers.add(number);
            }
        }
        Arrays.sort(input);  // ekvivalent za masivi ! //
        Collections.reverse(numbers);

        if (numbers.size() == 0){
            System.out.println("empty");
        }else{
            for ( int number : numbers){
                System.out.printf("%d" + " ", number);
            }
        }
    }
}
