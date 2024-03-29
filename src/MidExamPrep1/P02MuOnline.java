package MidExamPrep1;

import java.util.Scanner;

public class P02MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // rat 10|bat 20|potion 10|rat 10|chest 100|boss 70|chest 1000
        String [] rooms = scanner.nextLine().split("\\|");
        boolean isAlive = true;
        int health = 100;
        int bitCoins = 0;
        for (int i = 0; i < rooms.length; i++) {
            String room = rooms[i];
            String[] roomArgs = room.split(" ");
            String command = roomArgs[0];
            int commandValue = Integer.parseInt(roomArgs[1]);
            switch (command){
                case "potion":
                    int healthBeforeHealing = health;
                    health = Math.min(health + commandValue , 100);
                    System.out.printf("You healed for %d hp.%n", health - healthBeforeHealing);
                    System.out.printf("Current health: %d hp.%n", health);
                    break;
                case "chest":
                    bitCoins +=commandValue;
                    System.out.printf("You found %d bitcoins.%n",commandValue);
                    break;
                    default:
                        health -= commandValue;
                        if (health > 0){
                            System.out.printf("You slayed %s.%n",command);
                        }else {
                            System.out.printf("You died! Killed by %s.%n",command);
                            System.out.printf("Best room: %d", i + 1);
                            isAlive= false;
                        }
                        break;
            }
            if (!isAlive){
                break;
            }
        }
        if (isAlive){
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n",bitCoins);
            System.out.printf("Health: %d%n",health);
        }
    }
}
