/*
 * 20. Enhance loop in java Program
 */

public class EnhancedForLoop {

	public static void main(String[] args) {
			 int primes[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
			 
			 for(int prime : primes) {
				  System.out.print(prime +" ");
			 }
			 
			 System.out.println();
			 
			 String languages[] = { "C", "C++", "Java", "Python", "Ruby"};
			 
			 for(String language : languages) {
				 System.out.print(language +" ");
			 }
	}
}
