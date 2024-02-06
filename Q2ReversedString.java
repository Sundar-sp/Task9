package task09;

import java.util.Scanner;

public class Q2ReversedString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Word: ");
		String word = sc.nextLine();
		sc.close();
		String revers = "";
		for(int i=word.length()-1; i>=0; i--) {
			revers = revers + word.charAt(i);
		}
		System.out.println("Reversed String: "+ revers);
	}

}



Output:
Enter a Word: 
hello
Reversed String: olleh
