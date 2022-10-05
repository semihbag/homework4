// Name: Semih
// Surname : Bağ


/* Purpose : Write a program that will determine whether or not it is valid per the Luhn formula.
 *  The Luhn algorithm is a simple checksum formula used to validate a variety of identification 
 *  numbers, such as credit card numbers. The task is to check if a given string is valid.*/

// Add Scanner
import java.util.Scanner;

public class HW4_Q2_150120070 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Get the number from user
		String number = input.nextLine();
		
		
		// Check is input valid
		int i = 0;
		int count = 0;		
		boolean isFullDigit = true;
		while ((i < number.length()) && (isFullDigit)) {
			int x = number.charAt(i);
			if ((x == 32) || ((x >= 48) && (x <= 57))) {
				isFullDigit = true;
				i++;
				if (x != 32)
					count++;
			}
			else {
				isFullDigit = false;
			}
		}
		
		
		// Print the results
		if ((isFullDigit) && (count > 1)) {
			// Get ride of spaces
			int[] digits = new int[number.length()];
			int j = 0;
			for(i = 0 ; i < number.length() ; i++) {
				if (number.charAt(i) != 32) {
					digits[j] = number.charAt(i) - 48;
					j++;
				}
				else
					continue;
			}
			
			// Convert from digit to '_'
			System.out.print("DNumber:");
			for(i = j-1 ; i >= 0 ; i--) {
				if (i % 2 == 0)
					System.out.print("_");
				else
					System.out.print(digits[j-1-i]);
			}
			System.out.println("");
			
			// Calculate double every second digit
			for (i = 0 ; i < j ; i++) {
				if (i % 2 != 0) {
					digits[j-1-i] = (digits[j-1-i] * 2 > 9)? (digits[j-1-i] * 2 - 9) : (digits[j-1-i] * 2); 
				}
			}
			
			// Print getting doubled string of number
			System.out.print("LNumber:");
			for (i = 0 ; i < j ; i++) {
				System.out.print(digits[i]);
			}
			System.out.println("");

			// Invoke  validateNumer and check whether number is valid
			if (validateNumber(number)) {
				System.out.println("Number is Valid");
			}
			else {
				System.out.println("Number is Invalid");
			}
		}		
		else {
			System.out.println("Invalid Input !");
		}
	}
	
	// Check whether number is valid
	public static boolean validateNumber(String number) {		
		int[] digits = new int[number.length()];
		int j = 0;
		int count = 0;
		
		// Get ride of spaces
		for(int i = 0 ; i < number.length() ; i++) {
			if (number.charAt(i) != 32) {
				digits[j] = number.charAt(i) - 48;
				j++;
			}
			else
				continue;
		}
		
		// Check is number valid
		for (int i = 0 ; i < j ; i++) {
			if (i % 2 != 0) {
				digits[j-1-i] = (digits[j-1-i] * 2 > 9)? (digits[j-1-i] * 2 - 9) : (digits[j-1-i] * 2); 
				count += digits[j-1-i];	
			}
			else
			count += digits[j-1-i];	
		}
		boolean isValid = (count % 10 == 0)? true : false;
		return isValid;		
	}
}
