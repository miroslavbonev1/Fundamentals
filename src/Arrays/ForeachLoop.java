package Arrays;

import java.util.Scanner;

public class ForeachLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] elements = scanner.nextLine().split(" ");
        for(String element : elements){
            System.out.println(element);
        }
    }
    // foreach e read-only i raboti vurhy masiva
}
