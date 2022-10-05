// Name: Semih
// Surname: Bað
// Student ID: 150120070

/* Purpose: Write a program that calculates the invoice of each flat in an apartment building.
 * Assume that there are N flats in a building and apartment heating is the central system.
 * 30% of bill will be shared equally among the flats, the rest 70% will be shared according to the 
 * consumption of each flat.*/

// Add Scanner
import java.util.Scanner;

public class HW4_Q1_150120070 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Get the number of flats from user
		int n = input.nextInt();
		// Create an array that includes area of each flat's
		double[] flats = new double[n];		
		for (int i = 0 ; i < flats.length ; i++) {
			flats[i] = input.nextDouble();
		}
		// Get the total amount of bill
		double totalBill = input.nextDouble();
		
		// Invoke printBills and calculateTheInvoice method to calculate and print the each bill
		printBills(calculateTheInvoice(flats, totalBill));
	}
	
	// Calculate the bill for each flat
	public static double[] calculateTheInvoice(double[] flats, double totalBill) {
		double totalArea = 0;
		double[] bills = new double[flats.length];
		for (int i = 0 ; i < flats.length ; i++) {
			totalArea += flats[i];
		}
		for (int i = 0 ; i < flats.length ; i++) {
			bills[i] = ((totalBill/100) * 30)/flats.length + (((totalBill/100) * 70)/totalArea) * flats[i];
		}
		return bills;
	}
	
	// Print the invoice of each flat
	public static void printBills(double[] bills) {	
		for (int i = 0 ; i < bills.length ; i++) {
			System.out.println("Flat #" + (i+1) +": " + (int)(bills[i]*100)/100.0);
		}
	}
}
