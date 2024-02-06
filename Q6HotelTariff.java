package task09;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Q6HotelTariff {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter month: ");
		int month = sc.nextInt();
		System.out.print("Enter Room Rent per day: ");
		float rent = sc.nextFloat();
		System.out.print("Enter number of days: ");
		int days = sc.nextInt();
		sc.close();
		DecimalFormat df = new DecimalFormat(".00");
		double seasonsrent = rent+(rent*.2);
		switch (month) {
		case 4:
			double april = seasonsrent*days;
			System.out.println("Hotel Tariff:"+df.format(april));
			break;
		case 5:
			double may = seasonsrent*days;
			System.out.println("Hotel Tariff:"+df.format(may));
			break;
		case 6:
			double june = seasonsrent*days;
			System.out.println("Hotel Tariff:"+df.format(june));
			break;
		case 11:
			double nov = seasonsrent*days;
			System.out.println("Hotel Tariff:"+df.format(nov));
			break;
		case 12:
			double dec = seasonsrent*days;
			System.out.println("Hotel Tariff:"+df.format(dec));
			break;
		default:
			System.out.println("Hotel Tariff:"+df.format(rent*days));
		}
		}
}


Output:
Enter month: 5
Enter Room Rent per day: 1500
Enter number of days: 2
Hotel Tariff:3600.00
