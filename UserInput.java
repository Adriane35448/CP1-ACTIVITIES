import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("What is your name?: ");
		String name = scanner.nextLine();
		
		System.out.print("How old are you? ");
		int age = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.print("Where do you live? ");
		String address = scanner.nextLine();
		
		System.out.print("What is your course? ");
		String course = scanner.nextLine();
		
		System.out.print("What section? ");
		String section = scanner.nextLine();
		
		System.out.print("What year? ");
		String year = scanner.nextLine();
		
		System.out.print("Subject? ");
		String subject = scanner.nextLine();
		
		System.out.print("What day? ");
		String day = scanner.nextLine();
		
		System.out.print("What time: ");
		String time = scanner.nextLine();
		
		

		
		System.out.print("\nMy name is "+name+ ", ");
		System.out.print("I am "+age+" years old, ");
		System.out.print("I live in "+ address + ", ");
		System.out.print("I am a "+ year + " student ");
		System.out.print("under section "+ section + (" and "));
		System.out.println("taking up "+ course +".");
		System.out.println( );
		System.out.println("Subject: "+ subject);
		System.out.println("Lab day: "+ day);
		System.out.println("Lab Time: "+ time);
		
		scanner.close();
	}

}
