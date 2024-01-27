package finalExamPrep;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //regex = (@#{1,})(?<interesting>[A-Z][A-Za-z0-9]{0,4}[A-Z])\1
        // @#+([A-Z][a-zA-Z0-9]{4,}[A-Z])#+
        // no chislata ne se dobavqt kum tezi 6 ==> samo bukvi
        Pattern p = Pattern.compile("(@#+)(?<barcode>[A-Z][A-Za-z0-9]{4,}[A-Z])\\1");
        int barcodesCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < barcodesCount; i++) {
            String barcode = scanner.nextLine();
            Matcher matcher = p.matcher(barcode);
            if (matcher.find()) {
                String textBarcode = matcher.group("barcode");
                StringBuilder digitsBarcode = new StringBuilder();
                for ( char digit : textBarcode.toCharArray()){
                    if (Character.isDigit(digit)){
                        digitsBarcode.append(digit);
                    }
                }
                if (digitsBarcode.length() == 0){
                    System.out.println("Product group: 00");
                }else{
                    System.out.printf("Product group: %n" + digitsBarcode);
                }
            }else{
                System.out.println("Invalid barcode");
            }
        }
    }
}
