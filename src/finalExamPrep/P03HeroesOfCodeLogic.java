package finalExamPrep;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P03HeroesOfCodeLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberHeroes = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> nameHp = new HashMap<>();
        Map<String, Integer> nameMana = new HashMap<>();

        for (int i = 0; i < numberHeroes; i++) {
            String heroData = scanner.nextLine();
            String[] parts = heroData.split(" ");
            nameHp.put(parts[0], Integer.valueOf(parts[1]));
            nameMana.put(parts[0], Integer.valueOf(parts[2]));
        } // mana 200 , hp 100
            String command = scanner.nextLine();
            while (!command.equals("End")){
                String[] commandParts = command.split(" - ");
                String commandName = commandParts[0];
                String heroName = commandParts[1];

                switch (commandName){
                    case "Heal":
                        int rechargedHp = Integer.parseInt(commandParts[2]);
                        if ((nameHp.get(heroName) + rechargedHp) > 100){
                            int differenceHp = 100 - nameHp.get(heroName);
                            System.out.printf("%s healed for %d HP!%n",heroName, differenceHp);
                            nameHp.put(heroName,100);
                        }else{
                            nameHp.put(heroName, nameHp.get(heroName) + rechargedHp);
                            System.out.printf("%s healed for %d HP!%n",heroName,rechargedHp);
                        }
                        break;
                    case "Recharge":
                        int rechargedMana = Integer.parseInt(commandParts[2]);
                        if ((nameMana.get(heroName) + rechargedMana) > 200){
                            int difference = 200 - nameMana.get(heroName);
                            System.out.printf("%s recharged for %d MP!%n",heroName, difference);
                            nameMana.put(heroName,200);
                        }else{
                            nameMana.put(heroName,nameMana.get(heroName) + rechargedMana);
                            System.out.printf("%s recharged for %d MP!%n",heroName,rechargedMana);
                        }
                        break;
                    case "TakeDamage":
                        int damage = Integer.parseInt(commandParts[2]);
                        if (nameHp.get(heroName) > damage){
                            System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",
                                    heroName,damage,commandParts[3], nameHp.get(heroName) - damage);
                            nameHp.put(heroName, nameHp.get(heroName) - damage);
                        }else{
                            System.out.printf("%s has been killed by %s!%n",heroName,commandParts[3]);
                            nameHp.remove(heroName);
                            nameMana.remove(heroName);
                        }
                        break;
                    case "CastSpell":
                        int mana = Integer.parseInt(commandParts[2]);
                        if (nameMana.get(heroName) >= mana){
                            System.out.printf("%s has successfully cast %s and now has %d MP!%n",
                                    heroName,commandParts[3], nameMana.get(heroName) - mana);
                            nameMana.put(heroName,nameMana.get(heroName) - mana);
                        }else{
                            System.out.printf("%s does not have enough MP to cast %s!%n",heroName,commandParts[3]);
                        }
                        break;
                }
                command = scanner.nextLine();
            }
        for (String name : nameHp.keySet()){
            System.out.printf("%s%n",name);
            System.out.printf("  HP: %d%n", nameHp.get(name));
            System.out.printf("  MP: %d%n",nameMana.get(name));
        }
    }
}
