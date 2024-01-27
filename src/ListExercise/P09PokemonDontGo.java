package ListExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class P09PokemonDontGo  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());
        while(numbers.size() > 0){
            int index = Integer.parseInt(scanner.nextLine());
            if (index >= 0  && index <= numbers.size() - 1) {
                int removedElement = numbers.get(index); // premahnat element
                sum += removedElement;
                numbers.remove(index);
                modifyList(numbers, removedElement);
            } else if ( index < 0){
                int removedElement = numbers.get(0);
                sum += removedElement;
                numbers.remove(0);
                numbers.add(0,numbers.get(numbers.size() - 1));
                modifyList(numbers,removedElement);
            }else if ( index > numbers.size() - 1 ){
                int removedElement = numbers.get(numbers.size() - 1);
                int firstElement = numbers.get(0);
                sum += removedElement;
                numbers.remove(numbers.size() - 1);
                numbers.add(firstElement);
                modifyList(numbers,removedElement);
            }
        }
        System.out.println(sum);
    }
    public static void modifyList(List<Integer> numbers, int removedElement){
        for (int i = 0; i <= numbers.size() - 1; i++) {
            int currentElement = numbers.get(i);
            if (removedElement >= currentElement){
                currentElement += removedElement;
            }else{
                currentElement -= removedElement;
            }
            numbers.set(i,currentElement);

        }
    }
}
