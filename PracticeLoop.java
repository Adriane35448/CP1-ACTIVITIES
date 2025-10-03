
public class PracticeLoop {

	public static void main(String[] args) {
		
		int num = 6;


        for (int i = 1; i <= num; i++) {            
        	for (int x = 1; x <= i; x++) {
                System.out.print("");
            }
        	for (int y = 1; y <= i; y++) {
                System.out.print(i+" ");
        	}
            System.out.println();
        }
	}

}
