import java.util.Scanner;

public class MyCalcByMethods {

    public static void main(String[] args) {
        String helloMessage = "Hello, i,m Calc, please choose operation\n1 '+'\n2 '-' \n3 '*' \n4 '/'";
        String enterFirstNumberMessage = "Enter first num: ";
        String enterSecondNumMessage = "Enter second num: ";
        Scanner scanner = new Scanner(System.in);
        int operation = getNumberByMessage(scanner, helloMessage);
        int firstNum = getNumberByMessage(scanner, enterFirstNumberMessage);
        int secondNum = getNumberByMessage(scanner, enterSecondNumMessage);
        int result = calculate(firstNum, secondNum, operation);
        reportResult(result, getSelectedOperation(operation));
    }

    private static void reportResult(int result, String operation) {
        System.out.println("The result of " + operation + " is " + result);
    }

    private static int calculate(int firstNum, int secondNum, int operation) {
        int result = 0;
        if(operation == 1) {
            result = addTwoIntNumbers(firstNum, secondNum);
        } else if(operation == 2) {
            result = diffTwoIntNumbers(firstNum, secondNum);
        } else if(operation == 3) {
            result = multiplyTwoIntNumbers(firstNum, secondNum);
        } else {
            result = divideTwoIntNumber(firstNum, secondNum);
        }
        return result;
    }

    private static int divideTwoIntNumber(int firstNum, int secondNum) {
        return firstNum / secondNum;
    }

    private static int multiplyTwoIntNumbers(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    private static int diffTwoIntNumbers(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    private static int addTwoIntNumbers(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    private static int getNumberByMessage(Scanner scanner, String message) {
        System.out.println(message);
        return scanner.nextInt();
    }

    private static String getSelectedOperation(int operation) {
        String messageOperation = null;
        if(operation == 1) {
            messageOperation = "addition";
        } else if(operation == 2) {
            messageOperation = "difference";
        } else if(operation == 3) {
            messageOperation = "multiplication";
        } else {
            messageOperation = "division";
        }
        return messageOperation;
    }
}
