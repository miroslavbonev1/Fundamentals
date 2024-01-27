package finalExamPrep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,String> composerByPiece = new LinkedHashMap<>();
        Map<String,String> keyByPiece = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split("\\|");
            String piece = parts[0];
            String composer = parts[1];
            String key = parts[2];
            composerByPiece.put(piece,composer);
            keyByPiece.put(piece,key);
        }
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("Stop")){
                break;
            }
            String[] commandParts = line.split("\\|");
            String command = commandParts[0];
            switch (command){
                case "Add":
                    String piece = commandParts[1];
                    String composer = commandParts[2];
                    String key = commandParts[3];

                    if (composerByPiece.containsKey(piece)){
                        System.out.printf("%s is already in the collection!%n",piece);
                    }else{
                        composerByPiece.put(piece,composer);
                        keyByPiece.put(piece,key);
                        System.out.printf("%s by %s in %s added to the collection!%n",piece,composer,key);
                    }
                    break;
                case "Remove":
                    String pieceToRemove = commandParts[1];
                    if (!composerByPiece.containsKey(pieceToRemove)){
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n",pieceToRemove);
                    }else{
                        composerByPiece.remove(pieceToRemove);
                        keyByPiece.remove(pieceToRemove);

                        System.out.printf("Successfully removed %s!%n",pieceToRemove);
                    }
                    break;
                case "ChangeKey":
                    String pieceToChange = commandParts[1];
                    String newKey = commandParts[2];
                    if (!composerByPiece.containsKey(pieceToChange)){
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n",pieceToChange);
                    }else{
                        keyByPiece.put(pieceToChange,newKey);
                        System.out.printf("Changed the key of %s to %s!%n",pieceToChange,newKey);
                    }
                    break;

            }
        }

        /*composerByPiece
                .entrySet()
                .stream()
                .sorted((e1,e2) -> {
                    int pieceNameSortResult = e1.getKey().compareTo(e2.getKey());
                    if (pieceNameSortResult != 0){
                        return pieceNameSortResult;
                    }
                    return e1.getValue().compareTo(e2.getValue());
                })
                .forEach((e) -> {
                    String piece = e.getKey();
                    String composer = e.getValue();
                    String key = keyByPiece.get(piece);
                    System.out.printf("%s -> Composer: %s, Key: %s%n",piece,composer,key);

                });*/
        for (Map.Entry<String, String> entry : composerByPiece.entrySet()){
            String piece = entry.getKey();
            String composer = entry.getValue();
            String key = keyByPiece.get(piece);
            System.out.printf("%s -> Composer: %s, Key: %s%n",piece,composer,key);
        }
    }
}
