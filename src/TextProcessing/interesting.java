package TextProcessing;

import java.util.Scanner;

public class interesting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "Gosho,,, hello to bulgaria .. ";

        String [] textArray = text.split("[, .]+");
        System.out.println(String.join(" ",textArray));
        String[] replacedText = text.replace("Gosho","Nasko").split("[, .]+");
        System.out.println(String.join(" ",replacedText));
    }
}
