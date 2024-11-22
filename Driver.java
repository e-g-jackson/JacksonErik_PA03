/**
 *  Description: This program will take an unspecified number of integer inputs from the user and then calculate their average.
 *  			 It will also track the total number of inputs as well as the number of positive and negative inputs. The program will
 *  			 also keep a running tally of the sum of the numbers. If no inputs are received, it will notify the user of that as well.
 *  
 *  Inputs: The program will take an unspecified number of integers as inputs.
 *  
 *  Outputs: The program will output the total number of positive and negative integers, the sum of all of the integers, and the average.
 * 
 * 
 * @author - Erik Jackson
 * @contact - erik.jackson@my.century.edu
 * @since - 09/22/2024
 * 
 * 
 * Institution: Century College
 * Class: CSCI 1082-01 Fa24
 * Professor: Mathew Nyamagwa
 */
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// VARIABLES
		// Set up the scanner for user inputs.
		Scanner input = new Scanner(System.in);
		// Declare and initialize the variables
		int positiveNums = 0;				// This counter will track the positive user inputs, initialized to 0.
		int negativeNums = 0;				// This counter will track the negative user inputs, initialized to 0.
		int totalNums = 0;					// This counter will track the total user inputs, initialized to 0.
		double sum = 0.0;					// This variable will keep a running tally of the sum of the user inputs, initialized to 0.
		double average;						// This variable will be the average of all of the user inputs.
		
		// INPUTS
		// Prompt the user to enter the integer inputs
		System.out.print("Enter some integers, the input ends if 0 is entered:");
		// Take in the integer inputs from the user.
		int nextNum = input.nextInt();
		
		// COMPUTING
		// The while loop will loop as long as the inputs does not equal 0.
		while(nextNum != 0) {
			if(nextNum > 0) {				// If the user input is positive, 
				positiveNums++;				// it will increment the positiveNums tracker.
			}else if (nextNum < 0) {		// If the user input is negative, 
				negativeNums++;				// it will increment the negativeNums tracker.
			}
			
			sum += nextNum;					// Adds the current input value to the sum tracker.
			totalNums++;					// Increments the tracker that keeps track of all of the numbers, positive or negative.
			
			nextNum = input.nextInt();		// Takes the next input to decide if it will execute another loop.
		}
		
		// CALCULATION
		// Calculate the average of all of the user inputs
		average = (sum/totalNums);
		
		// OUTPUTS
		if(totalNums != 0) { 				// If there have been any inputs, display the results.
			// Displays the counters and the result of the calculations.
			System.out.println("The number of positive numbers:  " + positiveNums);
			System.out.println("The number of negative numbers:  " + negativeNums);
			System.out.println("The total:  " + sum);
			System.out.print("The average:  ");
			System.out.printf("%.2f\n", average);
		} else {							//If there have been no inputs, the output will say so.
			System.out.println("No numbers are entered except 0");
		}
		
		// Close the scanner for user inputs.
		input.close();
	}

}
