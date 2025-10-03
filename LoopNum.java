
public class LoopNum {

	public static void main(String[] args) {
		
		
		for (int i = 100; i >= 10; i -= 10) {
			System.out.print(i+" ");
		}
		
		System.out.println("\n");
		
		
		
		int y = 100;
		while (y >= 10) {
			System.out.print(y + "  ");
			y -= 10 ;
		}
		
		
		System.out.println("\n");
		
		
		
		int x = 100;
		do {
			System.out.print(x + "   ");
			x -= 10;
		}
		while (x >= 10);
		
		
		System.out.println("\n\n\n");
		
		
		
		int a = 10;
		while (a <= 100) {
			System.out.print(a + " ");
			a += 10 ;
		}
		
		
		System.out.println("\n");
		
		
		int b = 10;
		while (b <= 100) {
			System.out.print(b + "  ");
			b += 10 ;
		}
		
		
		System.out.println("\n");
		
		
		
		int c = 10;
		do {
			System.out.print(c + "   ");
			c += 10;
		}
		while (c <= 100);
		
		
		System.out.println("\n");
		
	}

}
