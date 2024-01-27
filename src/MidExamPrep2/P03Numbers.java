package MidExamPrep2;

import java.util.*;

public class P03Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        double averageSum = 0;
        int numbersLength = input.length;
        if (numbersLength < 5 ){
            System.out.println("No");
        }else{
            List<Integer> result = new ArrayList<>();
            for ( int number : input){
                sum += number;
            }
            averageSum = sum * 1.0 / numbersLength;
            for (int i = 0; i < input.length; i++) {
                int currentNum = input[i];
                if (currentNum > averageSum){
                    result.add(currentNum);
                }
            }
            Collections.sort(result);
            Collections.reverse(result);
            for (int i = result.size() - 1; i >= 5 ; i--) {
                result.remove(i);
            }
            for (int resultNumber : result){
                System.out.print(resultNumber + " ");
            }
        }
        }
    }
