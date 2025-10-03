import java.util.Scanner;

public class MyCalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your first number: ");
		double num1 = scanner.nextDouble();
		
		System.out.print("Enter your second number: ");
		double num2 = scanner.nextDouble();
		
		
		double sum = num1 + num2;
		
		double difference = num1 - num2;
		
		double product = num1 * num2;
		
		double quotient = num1 / num2;
		
		double modulus = num1 % num2;
		
		
		System.out.println("\nThe sum is " + sum);
		System.out.println("The difference is " + difference);
		System.out.println("The product is " + product);
		System.out.printf("The quotient is %.2f%n ", quotient);
		System.out.println("The modulus is " + modulus);
		
		
		if(sum  % 2 == 0) {
			System.out.println("\nThe sum is even.");
		}
		else {
			System.out.println("\nThe sum is odd.");
		}
		
		
		
		scanner.close();

	}

}
