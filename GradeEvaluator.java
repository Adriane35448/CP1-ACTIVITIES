import java.util.Scanner;

public class GradeEvaluator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double grade;
		
		System.out.print("Enter your grade: ");		
		grade = scanner.nextDouble();
		
		
		if(grade >= 75) {
			System.out.println("\nYou are passed");
		}
		
		else {
			System.out.println("\nYou are failed");
		}
		
		scanner.close();

	}

}
