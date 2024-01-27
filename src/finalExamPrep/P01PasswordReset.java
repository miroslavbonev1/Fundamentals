package finalExamPrep;

import java.util.Scanner;

public class P01PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String text = scanner.nextLine();
        StringBuilder edit = new StringBuilder(input);
        while (!text.equals("Done")){
            String[] parts = text.split(" ");
            String command = parts[0];
            switch (command){
                case "TakeOdd":
                    for (int i = 0; i < input.length(); i+=2) {
                        String idx = "";
                        edit.delete(i,i+1);
                    }
                    System.out.println(edit);
                    break;
                case "Cut":
                    int start = Integer.parseInt(parts[1]);
                    int plus = Integer.parseInt(parts[2]);
                    edit.substring(start,start+plus).toString();

                    System.out.println(edit);
                    break;
                case "Substitute":

                    break;
            }


            text = scanner.nextLine();

        }
    }
}
