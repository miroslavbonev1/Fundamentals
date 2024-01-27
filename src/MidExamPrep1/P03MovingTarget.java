package MidExamPrep1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        while(true){
            String line = scanner.nextLine();
            if (line.equals("End")){
                break;
            }

            String[] commandArgs = line.split(" ");
            String command = commandArgs[0];
            int idx = Integer.parseInt(commandArgs[1]);
            switch (command){
                case "Shoot":
                    int power = Integer.parseInt(commandArgs[2]);
                    if (isInside(targets,idx)) {
                        targets.set(idx, targets.get(idx) - power);
                        if (targets.get(idx) <= 0 ){
                            targets.remove(idx);
                        }
                    }
                    break;
                case "Add":
                    int value = Integer.parseInt(commandArgs[2]);
                    if (isInside(targets,idx)){
                        targets.add(idx, value);
                    }else{
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    int radius = Integer.parseInt(commandArgs[2]);
                    int leftIdx  = idx - radius;
                    int rightIdx = idx + radius;
                    if (isInside(targets,leftIdx) && isInside(targets,rightIdx)){
                        int count = radius * 2 + 1;
                        for (int i = 0; i < count; i++) {
                            targets.remove(leftIdx);
                        }
                    }else{
                        System.out.println("Strike missed!");
                    }
                    break;

            }
        }
        System.out.println(String.join("|",targets.stream().map(String::valueOf).toList()));

    }
    public static boolean isInside(List<Integer> list, int idx){
        return idx >= 0 && idx < list.size();
    }
}
