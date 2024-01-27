package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        for (int i = 0; i <= 3; i++) {
            names.add(scanner.nextLine());
        }
        String removedfValue = names.remove(3);
        // index out of bounds == davame mu stoinost na indeksa da mahnem koito go nqma !!!
        // ako ne znaem kolko letki = list ! ako znaem = masiv
        // tipa na lista == samo takiva elementi
        names.remove("Gosho");
        boolean sashaRemoved = names.remove("sasha");
        System.out.println(sashaRemoved);
        System.out.println(removedfValue);
        for(String name : names) {
            System.out.println(name);
        }
    }
}
