package finalExamPrep;

public class wkeoawka {
    public static void main(String[] args) {
        String inputString = "Hello, World!";
        char charToReplace = 'o';

        // Replace all occurrences of the char with the next ASCII character
        String result = replaceCharWithNextAscii(inputString, charToReplace);

        // Print the result
        System.out.println(result);
    }

    public static String replaceCharWithNextAscii(String inputStr, char charToReplace) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < inputStr.length(); i++) {
            char currentChar = inputStr.charAt(i);

            if (currentChar == charToReplace) {
                // Replace the char with the next ASCII character
                char nextChar = (char) (currentChar + 1);
                result.append(nextChar);
            } else {
                // Keep the character unchanged
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}