package MidExamPrep2;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03HeartDelivery {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Integer> houses = Arrays.stream(scanner.nextLine()
                 .split("@"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int lastPosition = 0;
        int previousIndex = 0;
        String input = scanner.nextLine();
        while (!input.equals("Love!")){
            List<String> commandTotal = Arrays.stream(input.split("Jump ")).collect(Collectors.toList());
            int index = Integer.parseInt(commandTotal.get(0));
            if (index > houses.size()){
                return;
            }else{
                houses.set(index, -2);
                int currentIndex = index;
                index += currentIndex;
            }

            input = scanner.nextLine();
        }
        System.out.println(houses);


    }
}
