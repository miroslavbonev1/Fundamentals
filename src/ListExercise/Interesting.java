package ListExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Interesting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String initialSchedule = scanner.nextLine();
        List<String> courseSchedule = new ArrayList<>();

        String[] initialLessons = initialSchedule.split(", ");
        for (String lesson : initialLessons) {
            courseSchedule.add(lesson);
        }

        String command = scanner.nextLine();

        while (!command.equals("course start")) {
            String[] tokens = command.split(":");
            String action = tokens[0];
            String lessonTitle = tokens[1];

            switch (action) {
                case "Add":
                    if (!courseSchedule.contains(lessonTitle)) {
                        courseSchedule.add(lessonTitle);
                    }
                    break;

                case "Insert":
                    int index = Integer.parseInt(tokens[2]);
                    if (index >= 0 && index < courseSchedule.size() && !courseSchedule.contains(lessonTitle)) {
                        courseSchedule.add(index, lessonTitle);
                    }
                    break;

                case "Remove":
                    courseSchedule.remove(lessonTitle);
                    String exerciseTitle = lessonTitle + "-Exercise";
                    courseSchedule.remove(exerciseTitle);
                    break;

                case "Swap":
                    String lessonTitle2 = tokens[2];
                    if (courseSchedule.contains(lessonTitle) && courseSchedule.contains(lessonTitle2)) {
                        int index1 = courseSchedule.indexOf(lessonTitle);
                        int index2 = courseSchedule.indexOf(lessonTitle2);
                        courseSchedule.set(index1, lessonTitle2);
                        courseSchedule.set(index2, lessonTitle);

                        String exerciseTitle1 = lessonTitle + "-Exercise";
                        String exerciseTitle2 = lessonTitle2 + "-Exercise";
                        if (courseSchedule.contains(exerciseTitle1) && courseSchedule.contains(exerciseTitle2)) {
                            int exerciseIndex1 = courseSchedule.indexOf(exerciseTitle1);
                            int exerciseIndex2 = courseSchedule.indexOf(exerciseTitle2);
                            courseSchedule.set(exerciseIndex1, exerciseTitle2);
                            courseSchedule.set(exerciseIndex2, exerciseTitle1);
                        }
                    }
                    break;

                case "Exercise":
                    exerciseTitle = lessonTitle + "-Exercise";
                    int lessonIndex = courseSchedule.indexOf(lessonTitle);
                    if (lessonIndex >= 0 && !courseSchedule.contains(exerciseTitle)) {
                        courseSchedule.add(lessonIndex + 1, exerciseTitle);
                    } else if (!courseSchedule.contains(lessonTitle)) {
                        courseSchedule.add(lessonTitle);
                        courseSchedule.add(lessonIndex + 1, exerciseTitle);
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i < courseSchedule.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, courseSchedule.get(i));
        }
    }
}