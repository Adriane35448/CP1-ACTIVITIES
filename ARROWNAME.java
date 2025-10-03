
public class ARROWNAME {

	public static void main(String[] args) {
    
		String name = "ADRIANE";
        int n = name.length();

        // Upper half (arrowhead tip)
        for (int i = 1; i <= n; i++) {
            for (int s = n - i; s > 0; s--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(name.charAt(j));
            }
            System.out.println();
        }
        

        // Arrow body (horizontal shaft with thickness 3)
        int bodyLength = 5; // length of horizontal shaft
        for (int t = 0; t < 3; t++) { // thickness = 3
            for (int b = 0; b < bodyLength; b++) {
                System.out.print(name);
            }
            System.out.println();
        }

        // Lower half (arrowhead bottom)
        for (int i = n - 1; i >= 1; i--) {
            for (int s = n - i; s > 0; s--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(name.charAt(j));
            }
            System.out.println();
        }
    }
}