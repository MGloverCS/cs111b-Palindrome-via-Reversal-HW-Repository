package reversePalindromeProject;

import java.util.Scanner;
import java.util.Arrays;

public class reversePalindromeProject { // Public class
	
	public static void main(String args[]) { // Main function
		System.out.print("Please enter a integer : ");
		Scanner scan = new Scanner(System.in);
		int userInteger = scan.nextInt();
		// User inputs integer, length of an array, and elements of an array.
		System.out.print("How long would you like your array to be? : ");
		Scanner scan1 = new Scanner(System.in);
		int arrayLength = scan1.nextInt();
		int userArray[]=new int[arrayLength];
		Scanner scan2 = new Scanner(System.in);
		for (int j = 0; j < arrayLength; j++) {
		    System.out.print("Enter element " + j + " of your array : ");
		    int arrayInput = scan2.nextInt();
		    userArray[j] = arrayInput; 
		}
		// Sets reverse values of user inputs by calling reverser method of reverse class.
		int integerOutput = reverse.reverser(userInteger);
		int arrayOutput[] = reverse.reverser(userArray);
		// Prints reverse of user integer and user array.
		System.out.println(integerOutput);
		System.out.println(Arrays.toString(arrayOutput));
		// If-Else statements use checkPalindrome method of palindrome class do determine whether user inputs are palindromes.
		if (palindrome.checkPalindrome(userInteger)) {
			System.out.println("Your integer is a palindrome.");
		}
		else {
			System.out.println("Your integer is not a palindrome.");
		}
		
		if (palindrome.checkPalindrome(userArray)) {
			System.out.println("Your array is a palindrome.");
		}
		else {
			System.out.println("You array is not a palindrome.");
		}
		// Closes scans
		scan.close();
		scan1.close();
		scan2.close();
	}
	
}