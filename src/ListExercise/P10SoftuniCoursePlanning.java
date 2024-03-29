package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10SoftuniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> topics = Arrays.stream(scanner.nextLine()
                .split(", "))
                .collect(Collectors.toList());
        String command = scanner.nextLine();
        while(!command.equals("course start")){
            String [] commandsParts = command.split(":");
            String topic = commandsParts[1];
            String commandName = commandsParts[0];
            switch (commandName){
                case "Add":
                    if (!topics.contains(topic)){
                        topics.add(topic);
                    }
                    break;
                case "Insert":
                    int indexForInsert = Integer.parseInt(commandsParts[2]);
                    if(topics.contains(topic)){
                        topics.add(indexForInsert,topic);
                    }
                    break;
                case "Remove":
                    if (topics.contains(topic)){
                        int topicIndex = topics.indexOf(topic);
                        String exerciseName = topic + "-Exercise";
                        boolean hasExercise = topicIndex !=topics.size() - 1
                                && topics.get(topicIndex + 1).equals(exerciseName);
                        topics.remove(topic);
                        if (hasExercise == true){
                            topics.remove(exerciseName);
                        }
                    }
                    break;
                case "Swap":
                    String topic2 =commandsParts[2];
                    if (topics.contains(topic) && topics.contains(topic2)){
                     int indexFirst = topics.indexOf(topic);
                     int indexSecond = topics.indexOf(topic2);
                     topics.set(indexSecond,topic);
                     topics.set(indexFirst,topic2);
                     String exFirstTopic = topic + "-Exercise";
                     String exSecondTopic = topic2 + "-Exercise";
                     if (topics.contains(exFirstTopic)){
                         topics.remove(exFirstTopic);
                         topics.add(topics.indexOf(topic) + 1,exFirstTopic);
                     }
                     else if (topics.contains(exSecondTopic)){
                         topics.remove(exSecondTopic);
                         topics.add(topics.indexOf(topic) + 1,exSecondTopic);
                        }
                    }
                    break;
                    case "Exercise":
                        String exerciseName = topic + "-Exercise";
                        if (topics.contains(topic)){
                            int indexTopic = topics.indexOf(topic);
                            if (indexTopic == topics.size() - 1){
                                topics.add(exerciseName);
                            }
                            else if (!topics.get(indexTopic + 1).equals(exerciseName)){
                                topics.add(indexTopic + 1, exerciseName);

                            }
                        }else{
                            topics.add(topic);
                            topics.add(exerciseName);
                        }
                        break;
            }
            command = scanner.nextLine();
        }
        int number = 1;
        for (String topic : topics){
            System.out.println(number + "." + topic);
            number ++;
        }

    }
}
