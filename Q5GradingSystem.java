package task09;

import java.util.Scanner;

public class Q5GradingSystem {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Mark: ");
		int m= sc.nextInt();
		sc.close();
		if(m==100) {
			System.out.println("Grade is 'S'");
		}else if(m>=90&&m<=99) {
			System.out.println("Grade is 'A'");
		}else if(m>=80&&m<=89) {
			System.out.println("Grade is 'B'");
		}else if(m>=70&&m<=79) {
			System.out.println("Grade is 'c'");
		}else if(m>=60&&m<=69) {
			System.out.println("Grade is 'D'");
		}else if(m>=50&&m<=59) {
			System.out.println("Grade is 'E'");
		}else if(m<50) {
			System.out.println("Grade is 'F'");
		}else if(m>100) {
			System.out.println("Invalid Input");
		}

	}

}
