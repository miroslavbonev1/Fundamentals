package Methods;

import java.util.Scanner;

public class repeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        String result = repeatString(text,count);
        System.out.println(result);
    }
    public static String repeatString(String text, int count){
        String[] result = new String[count];
        for (int i = 0; i < count; i++) {
            result[i] = text;
        }
        return String.join(" ",result);
        // string.join pravi abd dawd weqwe da pravi 1 string s zakaden delimiter, kogato imame masiv
        // ot stringove da go suberem v edin !!!!
    }
}
