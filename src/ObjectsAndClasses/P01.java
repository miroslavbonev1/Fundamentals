package ObjectsAndClasses;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split(" "))
                        .collect(Collectors.toList());
        List<String> result = new ArrayList<>();
        Random rdm = new Random();

        int inputWordsLen = input.size();
        for (int i = 0; i < inputWordsLen; i++) {
            int idx = rdm.nextInt(input.size());

            result.add(input.get(idx));
            input.remove(idx);
        }

        for (String word: result){
            System.out.println(word);
        }
    }
}
