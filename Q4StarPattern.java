package task09;

import java.util.Scanner;

public class Q4StarPattern {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Value: ");
		int number = sc.nextInt();
		sc.close();
		for(int i=1; i<=number; i++) {
			for(int j=1; j<=number; j++) {
				if(i==j||(i+j)==number+1) {
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}


Output:
Enter Value: 
5
*    * 
 *  *  
  *   
 *  *  
*    * 