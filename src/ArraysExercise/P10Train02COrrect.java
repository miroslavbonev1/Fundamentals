package ArraysExercise;

import java.util.Scanner;
import java.util.Arrays;

public class P10Train02COrrect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int[] wagons = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int peopleQueue = 0;
        boolean isLiftFull = false;

        for (int i = 0; i < wagons.length; i++) {

            if (wagons[i] == 0) {
                if (people >= 4) {
                    people -= 4;
                    wagons[i] += 4;
                } else {
                    peopleQueue = people;
                    people -= peopleQueue;
                    wagons[i] += peopleQueue;
                }

            } else if (wagons[i] == 1) {
                if (people >= 3) {
                    people -= 3;
                    wagons[i] += 3;
                } else {
                    peopleQueue = people;
                    people -= peopleQueue;
                    wagons[i] += peopleQueue;
                }
            } else if (wagons[i] == 2) {
                if (people >= 2) {
                    people -= 2;
                    wagons[i] += 2;
                } else {
                    peopleQueue = people;
                    people -= peopleQueue;
                    wagons[i] += peopleQueue;
                }
            } else if (wagons[i] == 3) {
                if (people >= 1) {
                    people -= 1;
                    wagons[i] += 1;
                } else {
                    peopleQueue = people;
                    people -= peopleQueue;
                    wagons[i] += peopleQueue;
                }
            }

            if (wagons[i] == 4 && people >= 0) {
                isLiftFull = true;
            } else if (people == 0 && wagons[i] <= 4) {
                isLiftFull = false;
                break;
            }
        }

        if (isLiftFull) {
            System.out.printf("There isn't enough space! %d people in a queue!\n", people);
        } else {
            System.out.println("The lift has empty spots!");
        }

        for (int num : wagons) {
            System.out.print(num + " ");
        }
    }
}


