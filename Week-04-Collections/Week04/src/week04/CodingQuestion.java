package week04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CodingQuestion {
	
static void wordReplace(List<String> tenWords, int num1, int num2, int num3) {
		
	    // WRITE YOUR CODE HERE
        List<String> threeWords = new ArrayList<String>();
        
        
        
        
        
        
        //Checking Valid number
        if (isValid(num1, tenWords)) {
            threeWords.add(tenWords.get(num1));
        } else {
            System.out.println("Invalid index for num1");
        }
        if (isValid(num2, tenWords)) {
        	threeWords.add(tenWords.get(num2));
        } else {
        	System.out.println("Invalid index for num2");
        } if (isValid(num3, tenWords)) {
        	threeWords.add(tenWords.get(num3));
        } else {
        	System.out.println("Invalid index for num3");
        }
        }




        static boolean isValid(int index, List<String> list) {
        	return index >= 0 && index < list.size();
        }










	/***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		
		List<String> tenWords = new ArrayList<String>();
		tenWords.add("Bumfuzzle");
		tenWords.add("Cattywampus");
		tenWords.add("Widdershins");
		tenWords.add("Gubbins");
		tenWords.add("Lollygag");
		tenWords.add("Malarkey");
		tenWords.add("Wabbit");
		tenWords.add("Impignorate");
		tenWords.add("Yarborough");
		tenWords.add("Bloviate");
		
		wordReplace(tenWords, num1, num2, num3);
		
	}
}


