package MidExamPrep2;

import java.util.Scanner;

public class P01GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double food = Double.parseDouble(scanner.nextLine()) * 1000;
        double hay = Double.parseDouble(scanner.nextLine()) * 1000;
        double cover = Double.parseDouble(scanner.nextLine()) * 1000;
        double pigWeight = Double.parseDouble(scanner.nextLine()) * 1000;
        // month = 30 days
        for (int day = 1; day <= 30 ; day++) {
            food -= 300;
            if (day % 2 == 0){
                double neededHay = food * 0.05;
                hay -= neededHay;
            }
            if (day % 3 == 0){
                double neededCover = pigWeight / 3;
                cover -= neededCover;
            }
            if (food <= 0 || hay <= 0 || cover <= 0 ){
                System.out.println("Merry must go to the pet store!");
                break;
            }
        }if (food <= 0 || hay <= 0 || cover <= 0 ){

        }
        else{
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",
                    food / 1000, hay /1000 , cover / 1000);
        }
    }
}
