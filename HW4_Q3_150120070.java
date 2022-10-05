// Name: Semih
// Surname: BAð
//Student ID: 150120070

/* Purpose: Write a program that takes an input letter and outputs it in a diamond shape.
 * Given a letter, it prints a diamond starting with 'A', with the supplied letter at the
 * widest point.*/

// Add Scanner
import java.util.Scanner;

public class HW4_Q3_150120070 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Get the letter from user
		String str = input.nextLine();
		
		// Check is input valid
		char letter = str.charAt(0);
		if (Character.isLetter(letter) && str.length() == 1) {
			letter = Character.toUpperCase(letter);	
			// Invoke printDiamond and constructDiamond to construct and print the diamond
			printDiamond(constructDiamond(letter));
		}
		else {
			System.out.println("Invalid Input !");
		}
	}

	// Construct the diamond
	public static char[][] constructDiamond(char letter){
		int i, j; 
		//Calculate distance between letter and A
		int d = letter - 'A';
		
		// Create an array an fill the array with '.'
		char[][] diamond = new char[2*d+1][2*d+1];		
		for (i = 0 ; i < 2*d +1 ; i++) {
			for (j = 0 ; j < 2*d +1 ; j++) {
				diamond[i][j] = '.';
			}
		}
		// Construct the diamond
		for (i = 0 ; i <= d ; i++) {
			diamond[i][d-i] = (char)('A' + i) ;
			diamond[i][d+i] = (char)('A' + i) ;
			diamond[2*d-i][d-i] = (char)('A' + i) ;
			diamond[2*d-i][d+i] = (char)('A' + i) ;
		}
		return diamond;
	}
	
	// Print the diamond
	public static void printDiamond (char[][] diamond) {
		for (int i = 0 ; i < diamond.length ; i++) {
			for(int j = 0 ; j < diamond.length ; j++) {
				if (j == diamond.length - 1)
					System.out.println(diamond[i][j]);
				else
					System.out.print(diamond[i][j]);
			}
		}
	}
}
