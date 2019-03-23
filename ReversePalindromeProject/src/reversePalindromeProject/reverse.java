package reversePalindromeProject;

public class reverse {
	
	public static int reverser(int number) {
		// Boolean statement determines whether integer is negative or not. If it is, the integer is multiplied by -1.
		boolean isNegative = number < 0 ? true : false;
		if(isNegative) {
			number = number * -1;
		}
		int reverse = 0;
		int lastDigit = 0;
		// While statement reverses integer
		while (number >= 1) {
			lastDigit = number % 10;
			reverse = reverse * 10 + lastDigit;
			number = number / 10;
		}
		
		return isNegative == true? reverse * -1 : reverse;
	}
	// Overstuffed reverser method allows for integer input option. This method reverses array using a for statement.
	public static int[] reverser(int number[]) {
		int outArray[]=new int[number.length];
		int j = 0;
		for(int i = number.length-1; i > -1; i-- )
		{   outArray[j++] = number[i];
		}
		return outArray;
	}
	
	
}