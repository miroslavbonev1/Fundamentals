package MidExamPrep2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> houses = Arrays.stream(scanner.nextLine().split("@"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        int lastPosition = 0;

        while (!input.equals("Love!")){
            String [] command = input.split(" ");
            int length = Integer.parseInt(command[1]);

            lastPosition += length;

            if (lastPosition > houses.size() - 1){
                lastPosition = 0;
            }

            if (lastPosition >= 0 && lastPosition < houses.size()){
                int houseLove = houses.get(lastPosition);

                if (houseLove == 0){
                    System.out.printf("Place %d already had Valentine's day.%n", lastPosition);
                } else {
                    houseLove -= 2;
                    houses.set(lastPosition, houseLove);
                    if (houseLove < 0){
                        houseLove = 0;
                        houses.set(lastPosition, houseLove);
                    }
                    if (houseLove == 0){
                        houses.set(lastPosition, houseLove);
                        System.out.printf("Place %d has Valentine's day.%n", lastPosition);
                    }
                }
            } else if (lastPosition >= houses.size()) {
                lastPosition = 0;
                int houseZero = houses.get(lastPosition);
                houseZero -= 2;
                houses.set(lastPosition, houseZero);

                if (houseZero <= 0){
                    System.out.println("Place 0 already had Valentine's day.");

                    if (houseZero < 0){
                        houseZero = 0;
                        houses.set(lastPosition, houseZero);
                    }

                    if (houseZero == 0){
                        houses.set(0, houseZero);
                        System.out.println("Place 0 has Valentine's day.");
                    }
                }
            }


            input = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", lastPosition);

        int count = 0;

        for (int i = 0; i < houses.size(); i++) {
            int current = houses.get(i);

            if (current > 0){
                count ++;
            }
        }

        if (count == 0){
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", count);
        }
    }
}