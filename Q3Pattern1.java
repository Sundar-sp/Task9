package task09;

import java.util.Scanner;

public class Q3Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value: ");
		int number = sc.nextInt();
		sc.close();
		int num = 1;
		for(int i=1; i<=number; i++) {
			for(int j=1; j<=i; j++) {
				
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}

	}

}


Output:
Enter value: 
5
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 