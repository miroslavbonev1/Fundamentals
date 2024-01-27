package List;

import java.util.*;

public class P04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> names = new ArrayList<>();/*(Arrays.asList(2, 3, 5, 7, 8));*/
        Collections.sort(names);
        System.out.println(names);

    }
}
