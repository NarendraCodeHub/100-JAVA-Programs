import java.util.Scanner;
/**
 * 14. How to complete 2 string in Java program.
 */
public class CompareString {
	public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
        	
            System.out.println("Enter the First String:");
            String str1 = scan.nextLine().trim(); 
            System.out.println("Enter the Second String:");
            String str2 = scan.nextLine().trim();
            
            // Validate inputs (allows alphabets and spaces)
		      if((!str1.equals(null))&&str1.matches("^[a-zA-Z\\s]+$") && 
		         (!str2.equals(null))&&str2.matches("^[a-zA-Z\\s]+$")) {
		    	  
	              //Compare String 
		    	  int comparisonResult = str1.compareToIgnoreCase(str2);
		    	  if (comparisonResult > 0) {
					System.out.println("First string is greater than second.");
					}else if (comparisonResult < 0) {
						System.out.println("First string is smaller than second.");
					}else {
						System.out.println("Both String are Equals.");
					}
			}else {
                System.out.println("Invalid input! Please enter strings containing only alphabets and spaces.");
			}
			
		} catch (Exception e) {
            System.out.println("An unexpected error occurred. Please try again.");
		}
				
	}
}
