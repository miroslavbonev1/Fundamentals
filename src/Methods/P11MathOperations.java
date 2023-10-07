package Methods;

import java.util.Scanner;

public class P11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());
        int result = operatorAndTotalSum(operator, firstNum,secondNum);
        System.out.println(result);
    }
    public static int operatorAndTotalSum(String operator, int firstNum , int secondNum){
        int value = operator.charAt(0);
        int sum = 0;
        if (value == 47){
            sum = firstNum / secondNum;
        } else if (value == 45) {
            sum = firstNum - secondNum;
        } else if (value == 42) {
            sum = firstNum * secondNum;
        }else if (value == 43){
            sum = firstNum + secondNum;
        }
        return(sum);
    }
}
