package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3));

        nums.add(123);
        nums.add(1);
        nums.remove(Integer.valueOf(123));
        nums.add(3);
        nums.add(1,550);
        nums.add(2,123); // dobavq ot index
        nums.set(2,1000); // zamenq //
        System.out.println(nums.contains(23));
        System.out.println(nums.contains(3));
        System.out.println(nums.contains(53));
        System.out.println(nums);
        System.out.println(nums.size()); // kato length
        System.out.println(nums.get(2) + 15); // izkarva na tozi index chisloto
    }
}
