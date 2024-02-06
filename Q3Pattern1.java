package task09;

import java.util.Scanner;

public class Q3Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value: ");
		int n = sc.nextInt();
		sc.close();
		int num = 1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				
				System.out.print(num);
				num++;
			}
			System.out.println();
		}

	}

}
