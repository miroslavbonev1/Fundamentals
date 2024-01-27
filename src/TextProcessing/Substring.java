package TextProcessing;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String text = scanner.nextLine();
        while (true) {
            int idx = text.indexOf(word);
            if (idx == -1) {
                break;
            }
            String leftSubstr = text.substring(0,idx);
            String rightSubstr = text.substring(idx + word.length());
            text = leftSubstr + rightSubstr;
        }
        System.out.println(text);
    }
}
