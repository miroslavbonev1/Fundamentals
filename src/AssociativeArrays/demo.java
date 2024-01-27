package AssociativeArrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Hell!");
        map.put(2,"Hell1");
        map.put(4,"Hell2");
        map.put(5,"Hell7");
        map.put(11,"Hell9");

        for( Integer key: map.keySet()){
            String value = map.get(key);
            System.out.printf("%d -> %s",key,value);
        }
        for (Map.Entry<Integer,String> kvp: map.entrySet()){
            System.out.printf("%d -> %s%n",kvp.getKey(),kvp.getValue());
        }
    }
}
