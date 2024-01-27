package MidExam;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Arrays;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> phones = Arrays.stream(scanner.nextLine().split(", "))
                        .collect(Collectors.toList());
        String firstCommand = scanner.nextLine();
        while(!firstCommand.equals("End")){
            String[] commandArray = firstCommand.split(" - ");
            String command = commandArray[0];
            String phone = commandArray[1];

            switch (command){
                case "Add":
                    if (!phones.contains(phone)){
                        phones.add(phone);
                    }
                    break;
                case "Remove":
                    if (phones.contains(phone)){
                        phones.remove(phone);
                    }
                    break;
                case "Bonus phone":
                    String[] newPhone = phone.split(":");
                    if (phones.contains(newPhone[0])){
                        int indexOfOldPhone = phones.indexOf(newPhone[0]);
                        phones.add(indexOfOldPhone + 1,newPhone[1]);
                    }
                    break;
                case "Last":
                    if (phones.contains(phone)){
                        int lastIndex = phones.size();
                        phones.remove(phone);
                        phones.add(lastIndex - 1,phone);
                    }
                    break;
            }
            firstCommand = scanner.nextLine();
        }
        System.out.println(String.join(", ",phones));
    }
}
