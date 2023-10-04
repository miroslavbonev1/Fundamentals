package ArraysExercise;

import java.util.Scanner;
import java.util.Arrays;

public class P10YoutubeHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double peopleLift = Double.parseDouble(scanner.nextLine());
        int[] currentLift = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        double peopleLeft = 0;
        int peopleCurrent = 0;
        for (int j = 0; j < currentLift.length - 1; j++) {
            peopleCurrent += currentLift[j];
        }
        if ( peopleLift - (currentLift.length * 4) > 4) {
            double peopleInQueue = peopleLift - (currentLift.length * 4) + peopleCurrent;
            System.out.printf("There isn't enough space! %.0f people in a queue!", peopleInQueue);
            System.out.println(Arrays.toString(currentLift)
                    .replace("[", "")
                    .replace("]", ""));
        } else {
            double difference = peopleLift - ((currentLift.length - 1) * 4);
            currentLift[currentLift.length - 1] += difference;
            System.out.println(Arrays.toString(currentLift)
                    .replace("[", "")
                    .replace("]", ""));
        }
        if (peopleLift <= (currentLift.length * 4)) {
            System.out.printf("The lift has empty spots!%n");
        }
        for (int i = 0; i < currentLift.length - 1; i++) {
            peopleLift -= 4;
            currentLift[i] += 4;
            if (currentLift[i] >= 4) {
                currentLift[i] = 4;
                currentLift[i + 1] += currentLift[i] - 4;
            }
        }
    }
}
