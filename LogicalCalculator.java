import java.util.Scanner;

public class LogicalCalculator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter First number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Select operation: +, -, *, /, %: ");
        char operation = scanner.next().charAt(0);
        
        System.out.print("Enter Second number: ");
        double num2 = scanner.nextDouble();                
        
        double result;
        
        switch(operation) {
            case '+':
                result = num1 + num2;
                System.out.println("\nResult: " + result);
                break;
                
            case '-':
                result = num1 - num2;
                System.out.println("\nResult: " + result);
                break;
                
            case '*':
                result = num1 * num2;
                System.out.println("\nResult: " + result);
                break;
                
            case '/':
                result = num1 / num2;
                System.out.printf("\nResult: %.2f\n", result); // 2 decimal places
                break;
                
            default:
                System.out.println("\nInvalid Operation.");
                return; 
        }     
        
        if (operation == '+') {
            System.out.println("The operation used is addition");
        } else if (operation == '-') {
            System.out.println("The operation used is subtraction");
        } else if (operation == '*') {
            System.out.println("The operation used is multiplication");
        } else if (operation == '/') {
            System.out.println("The operation used is division");
        } else {
            System.out.println("\nInvalid Operation.");
        }
        
        scanner.close();
    }
}