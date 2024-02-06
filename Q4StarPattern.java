package task09;

import java.util.Scanner;

public class Q4StarPattern {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Value: ");
		int n = sc.nextInt();
		sc.close();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==j||(i+j)==n+1) {
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
