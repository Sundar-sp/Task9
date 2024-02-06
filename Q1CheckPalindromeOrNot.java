package task09;

import java.util.Scanner;

public class Q1CheckPalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Word: ");
		String word = sc.nextLine();
		sc.close();
		char c[] = word.toCharArray();
		System.out.println("Reversed String: ");//for my reference
		String revers = "";
		for(int i=word.length()-1; i>=0; i--) {
			revers = revers+c[i];	
		}
		System.out.println(revers);//for my reference
		if(word.equals(revers)) {
			System.out.println("Given string is palindrome");
		}else {
			System.out.println("Given string is not a palindrome");
		}
	}

}



Output:
Enter a Word: 
malayalam
Reversed String: 
malayalam
Given string is palindrome

