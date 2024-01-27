package finalExamPrep;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 7;
        int b = ++a;
        int c = b++;
        int d = ++c;
        System.out.println(d);
    }
}

