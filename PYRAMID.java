
public class PYRAMID {

	public static void main (String[] args) {
		
		      String name= "ADRIANEACUANICO";
		      
		        int i = 0;
		        int totalRows = 5;

		        
		        for (int row = 1; row <= totalRows; row++) {

		            for (int space = 1; space <= totalRows - row; space++) {
		                System.out.print(" ");
		            }
 

		            for (int col = 1; col <= row; col++) {
		            	if (i< name.length()) {
		            		 System.out.print(name.charAt(i) + " ");
				                i++;
		            	}
		               
		            }


		            System.out.println();
		        }
		    }
		

    }