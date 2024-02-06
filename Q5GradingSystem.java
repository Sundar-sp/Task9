package task09;

import java.util.Scanner;

public class Q5GradingSystem {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Mark: ");
		int mark= sc.nextInt();
		sc.close();
		if(mark==100) {
			System.out.println("Grade is 'S'");
		}else if(mark>=90&&mark<=99) {
			System.out.println("Grade is 'A'");
		}else if(mark>=80&&mark<=89) {
			System.out.println("Grade is 'B'");
		}else if(mark>=70&&mark<=79) {
			System.out.println("Grade is 'c'");
		}else if(mark>=60&&mark<=69) {
			System.out.println("Grade is 'D'");
		}else if(mark>=50&&mark<=59) {
			System.out.println("Grade is 'E'");
		}else if(mark<50) {
			System.out.println("Grade is 'F'");
		}else if(mark>100) {
			System.out.println("Invalid Input");
		}

	}

}

Output:
Enter Mark: 
30
Grade is 'F'

