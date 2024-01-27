package FinalExamRetake;

import java.util.*;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Map<String,Integer> nameHealth = new HashMap<>();
        Map<String,Integer> nameEnergy = new HashMap<>();
        int peopleCount = 0;
        List<String> names = new ArrayList<>();
        while (!text.equals("Results")){
            String[] commandParts = text.split(":");
            String command = commandParts[0];
            switch (command){
                case "Add":
                    String personName = commandParts[1];
                    int health = Integer.parseInt(commandParts[2]);
                    int energy = Integer.parseInt(commandParts[3]);
                    if (nameHealth.containsKey(personName)) {
                        nameHealth.put(personName,nameHealth.get(personName) + health);
                    }else{
                        names.add(personName);
                        nameHealth.putIfAbsent(personName,health);
                        nameEnergy.putIfAbsent(personName,energy);
                    }
                    break;
                case "Attack":
                    String attackerName = commandParts[1];
                    String defenderName = commandParts[2];
                    int damage = Integer.parseInt(commandParts[3]);
                    if (nameHealth.containsKey(attackerName) && nameHealth.containsKey(defenderName)){
                        nameHealth.put(defenderName,nameHealth.get(defenderName) - damage);
                        if (nameHealth.get(defenderName) <= 0 ){
                            nameHealth.remove(defenderName);
                            nameEnergy.remove(defenderName);
                            System.out.printf("%s was disqualified!%n",defenderName);
                            names.remove(defenderName);
                        }
                        nameEnergy.put(attackerName,nameEnergy.get(attackerName) - 1);
                        if (nameEnergy.get(attackerName)<=0){
                            nameEnergy.remove(attackerName);
                            nameHealth.remove(attackerName);
                            names.remove(attackerName);
                            System.out.printf("%s was disqualified!%n",attackerName);                        }
                    }
                    break;
                case "Delete":
                    String nameDelete = commandParts[1];
                    if (nameHealth.containsKey(nameDelete)){
                        nameHealth.remove(nameDelete);
                        nameEnergy.remove(nameDelete);
                        names.remove(nameDelete);
                    }
                    if (nameDelete.equals("All")){
                        nameHealth.clear();
                        nameEnergy.clear();
                        names.removeAll(names);

                    }
                    break;
            }

            text = scanner.nextLine();
        }
        System.out.printf("People count: %d%n",nameHealth.size());
        for (int i = 0; i < nameHealth.size(); i++) {
            System.out.printf("%s - %d - %d%n",names.get(i),nameHealth.get(names.get(i)),nameEnergy.get(names.get(i)));
        }
    }
}
