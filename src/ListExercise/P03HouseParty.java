package ListExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberGuests = Integer.parseInt(scanner.nextLine());
        List<String> guests = new ArrayList<>();
        for (int i = 1; i <= numberGuests; i++) {
            String guestName = scanner.nextLine();
            String currentName = guestName.split(" ")[0];
            for (int j = 0; j < numberGuests; j++) {
                if (guests.get(i).equals(currentName)){
                    System.out.printf("%s is already in the list!",currentName);
                    guests.removeAll(Arrays.asList(currentName));
                    guests.add(currentName);
                }
                else if(!guests.get(i).equals(currentName)){
                    System.out.printf("%s is not in the list!",currentName);
                }
            }
            if (guestName.contains("is going!")) {
                guests.add(currentName);
            }
            else if (guestName.contains("is not going")) {
                guests.remove(currentName);
            }
        }
        for(String name : guests){
            System.out.println(name);
        }
    }
}
