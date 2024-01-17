package Week4CodingProject;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CodingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Question 1a of CodingProject");
		//Creating an array named ages.
		int ages[] = {3, 9, 23, 64, 2, 8, 28, 93};
		
		// Showing the first and last element in ages array.		
		System.out.println("First value in ages" + " " + ages[0]);
		System.out.println("Last value in ages" + " " + ages[ages.length - 1]);
		
		// Subtracting the first element from the last element in the ages array.
		int sum = 0;		
		sum = ages[ages.length - 1] - ages[0] ;		
		System.out.println("Subtract the first value from the last value" + " " + sum);
		
		// Loop through the ages array to add all the values together.
		int sum2 = 0;
		for (int i = 0; i < ages.length; i++) {
			sum2 += ages[i];
		}
		
		//Displaying the total and average age from the ages array.
		System.out.println("The total age of the array is" + " " + sum2);
		System.out.println("The average age from the age array is" + " " + sum2 / ages.length);
		
		System.out.println(" ");
		System.out.println("Question 1b of Coding Project");
				
		// Create a new array called ages2 with 9 elements.
		int ages2[] = {24, 48, 9, 50, 87, 6, 22, 34, 100};
		
		//Show the first and last value from the ages2 array.
		System.out.println("First value in ages2" + " " + ages2[0]);
		System.out.println("Last value in ages2" + " " + ages2[ages2.length - 1]);
		
		// Subtracting the first element from the last element in the ages2 array.
		int difference = 0;		
		difference = ages2[ages2.length - 1] - ages2[0] ;		
		System.out.println("Subtract the first value from the last value" + " " + difference);
				
		// Loop through the ages 2 array to add the values together.
		int difference2 = 0;
		for (int i = 0; i < ages2.length; i++) {
			difference2 += ages2[i];
		}
		System.out.println(" ");
		System.out.println("Question 1c of Coding Project");		
		//Displaying the total and average age from the ages2 array.
		System.out.println("The total age of the array is" + " " + difference2);
		System.out.println("The average age from the age array is" + " " + difference2 / ages2.length);
		
		System.out.println(" ");
		System.out.println("Question 2 of Coding Project");
		
		// Create a new array of String called names.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		System.out.println("Question 2a of Coding Project");
		
		int charCount = 0;
		for (String c : names) {
			charCount += c.length();
		}
		// Displaying the character count and average character count from the names array.
		System.out.println("The character count of the names array" + " " + charCount);
		System.out.println("The average character count from the names array" + " " + charCount / names.length);
		
		System.out.println(" ");
		System.out.println("Question 2b of Coding Project");
		// Concatenate the names with a StringBuilder.
		StringBuilder allNames = new StringBuilder();
		for (String n : names) { 
			allNames.append(n).append(" ");
		}
		System.out.println("All of the names concatenated:" + " " + allNames);
		
		System.out.println(" ");
		System.out.println("Question 3 of Coding Project");
		//Display the last element in the names array.  Use names[names.length - 1]
		String lastElement = names[names.length - 1];
		System.out.println("Last element is" + " " + lastElement);
		
		
		System.out.println(" ");
		System.out.println("Question 4 of Coding Project");
		//Display first element in names array. First position of an array is always 0.
		String firstElement = names[0];
		System.out.println("First element is" + " " + firstElement);
		
		System.out.println(" ");
		System.out.println("Question 5 of Coding Project");
		//Display the lengths of each element in names assign the counts to an array called nameLengths
		int[] nameLengths = new int[names.length];
		for (int count = 0; count < names.length; count++) {
			nameLengths[count] = names[count].length();
			System.out.println(nameLengths[count]);
		}
			
		
		
		System.out.println(" ");
		System.out.println("Question 6 of Coding Project");
		int total = 0;
		for (int counter = 0; counter < nameLengths.length; counter++) {
			total += nameLengths[counter];			
		}
		System.out.println(total);	
		
		System.out.println(" ");
		System.out.println("Question 7 of Coding Project");
		//Created a method that will print a word a specific amount of times.
		System.out.println(repeatWord("Hello", 3));
		
		System.out.println(" ");
		System.out.println("Question 8 of Coding Project");
		// Created a method that will print out a first name and last name with a space in between.
		System.out.println(fullName("Nelson", "Jones"));
		
		System.out.println(" ");
		System.out.println("Question 9 of Coding Project");
		// Passed the ages array into the sumGreaterThan100 method.  The sum was greater than 100.
		System.out.println(sumGreaterThan100(ages));
		
		System.out.println(" ");
		System.out.println("Question 10 of Coding Project");
		// Created an array of double that is passed into a method that returns the average of the array sum.
		double[] doubleArray = {2.1, 4.5, 8.2, 7};
		System.out.println(returnAverage(doubleArray));
		
		System.out.println(" ");
		System.out.println("Question 11 of Coding Project");
		// Created two double arrays that are passed into a method to calculate the average of both.  
		// Test if first array is greater than second array.
		double[] average1 = {1, 2, 3, 4, 5, 8, 100};
		double[] average2 = {1, 4, 2, 9, 25};
		System.out.println(twoArrayAverage(average1, average2));
		
		System.out.println(" ");
		System.out.println("Question 12 of Coding Project");
		// Create a method that returns a boolean if you should buy a drink or not buy a drink.
		System.out.println(willBuyDrink(true, 2.00));
		
		System.out.println(" ");
		System.out.println("Question 13 of Coding Project");
		// Simple method passing in an age to see if it is greater than or equal to a retirement age.
		System.out.println(shouldYouRetire(48));
	}	

	// Question 7 Method
		public static String repeatWord (String word, int n) {
			String repeatWord = "";
			for (int i = 0; i < n; i++) {
				repeatWord += word;
			}
			return repeatWord;
		}	
	// Question 8 Mehtod
		public static String fullName(String firstName, String lastName) {
			return firstName + " " + lastName;
		}
	// Question 9 Method
		public static boolean sumGreaterThan100(int[] arr) {
			int sum = 0;
			for (int num : arr) {
				sum += num;
			}
			return sum > 100;
		}
	// Question 10 Method
		public static double returnAverage(double[] arr) {
			double sum = 0;
			for (double num : arr) {
				sum += num;
			}
			return sum / arr.length - 1;
		}
	// Question 11 Method
		public static boolean twoArrayAverage(double[] arr, double[] arr2) {
			double sum = 0;
			double sum2 = 0;
			for (double num : arr) {
				sum = (sum + num) / arr.length - 1;
			} for (double num2 : arr2) {
				sum2 = (sum2 + num2) / arr2.length - 1;
			}
			return sum > sum2;
		}
	// Question 12 Method
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			return isHotOutside && moneyInPocket > 10.50;
		}
	//Question 12 Method
		public static boolean shouldYouRetire(int age) {
			return age >= 62;	
		}
			
		
}
		

