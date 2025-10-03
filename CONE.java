
public class CONE {

	public static void main (String[] args) {
		
		      String name= "ADRIANEACUANICO";
		      
		        int i = 0;
		        int totalRows = 5;

		        
		        for (int row = 1; row <= totalRows; row++) {
		            // Print spaces before the numbers
		            for (int space = 1; space <= (row - 1); space++) {
		                System.out.print(" ");
		            }
 
		            // Print numbers for this row
		            for (int col = 1; col <= (totalRows - row + 1); col++) {
		            	if (i< name.length()) {
		            		 System.out.print(name.charAt(i) + " ");
				                i++;
		            	}
		               
		            }

		            // Move to the next line
		            System.out.println();
		        }
		    }
		

    }