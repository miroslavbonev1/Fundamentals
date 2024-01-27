package TextProcessing;

import java.util.Date;
import java.util.Scanner;

public class StringCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(new Date());
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            text.append("abcd");
        }
        System.out.println(new Date());
        System.out.println(text.toString());
        System.out.println(text.length());
        System.out.println(text.capacity());
        System.out.println(text.insert(0,"Say hello to me xixi "));
        text.replace(10,15,"Hellos");
        System.out.println(text);
    }
}
