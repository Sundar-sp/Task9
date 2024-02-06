package task09;

import java.util.Scanner;

public class Q1CheckPalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Word: ");
		String s = sc.nextLine();
		sc.close();
		char c[] = s.toCharArray();
		System.out.println("Reversed String: ");
		String revers = "";
		for(int i=s.length()-1; i>=0; i--) {
			revers = revers+c[i];	
		}
		System.out.println(revers);
		if(s.equals(revers)) {
			System.out.println("Given string is palindrome");
		}else {
			System.out.println("Given string is not a palindrome");
		}
	}

}
