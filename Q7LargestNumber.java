package task09;

import java.util.Scanner;

public class Q7LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st value: ");
		int n1 = sc.nextInt();
		System.out.print("Enter 2nd value: ");
		int n2 = sc.nextInt();
		System.out.print("Enter 3rd value: ");
		int n3 = sc.nextInt();
		sc.close();
		if((n1>n2)&&(n1>n3)) {
			 
				System.out.println("1st value "+n1+" is largest value");
			}else if((n2>n1)&&(n2>n3)) {
			 
				System.out.println("2nd value "+n2+" is largest value");
			}else {
		  
				System.out.println("3rd value "+n3+" is largest value");
			}
		}
}
	

Output:
Enter 1st value: 10
Enter 2nd value: 30
Enter 3rd value: 20
2nd value 30 is largest value

