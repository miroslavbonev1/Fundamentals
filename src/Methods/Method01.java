package Methods;

import java.util.Scanner;

public class Method01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        sayHello(name,age);
        // v main metoda pishem koda i programata !!!
        //void = nishto ne vrushta~!
    }
    public static void sayHello(String name, int age){
        System.out.printf("Hello %s, happy %d's birthday!!!%n",name,age);
    }
}
