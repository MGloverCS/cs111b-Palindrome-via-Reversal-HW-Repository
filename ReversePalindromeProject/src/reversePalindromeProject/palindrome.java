package reversePalindromeProject;

import java.util.Arrays;

// palindrome class inherits from reverse class
public class palindrome extends reverse{
	
	// Overstuffed boolean method determines whether argument is integer or array, and returns true if argument is a palindrome.
	public static boolean checkPalindrome(int number) {
		return (number == reverser(number));
	}
	
	public static boolean checkPalindrome(int array[]) {
		return Arrays.equals(array, reverser(array));
	}
	
}