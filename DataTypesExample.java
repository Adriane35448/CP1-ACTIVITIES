
public class DataTypesExample {

	public static void main(String[] args) {
		
		int age = 21 ;
		
		double height = (5*0.305) + (9*0.0254);
		
		char lastnameinitial = 'A';
		
		boolean isStudent = true;
		
		String firstname = "Adriane";
		
		
		System.out.println("Name: " + firstname);
		System.out.println("Initial: " + lastnameinitial);	
		System.out.println("Age: " + age);
		System.out.println("Height: "+ height + " meter");
		System.out.println("Is Student: " + isStudent);	
		
		double weight = 90;
		double bmi =weight/(height*height);
		
		System.out.printf("BMI: %.2f%n", bmi);
		
		
		if (bmi <= 18.4) {
			System.out.println("Underweight");
		}
		else if (bmi <= 24.9) {
			System.out.println("Normal weight");
		}
		else if (bmi <= 29.9) {
			System.out.println("Overweight");
		}
		else {
			System.out.println("Obese");
		}

	}

}
