package Javaprograms;

import java.util.Scanner;

public class Weekday {
//	1. Write a program to read a weekday number and print weekday name using switch statement
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a weekday number between 1 and 7");
			int num = sc.nextInt();
			if (num <= 0 || num > 7) {
				System.out.println("invalid input...");
				return;
			}

			switch (num) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error"+e);
		}finally {
			sc.close();
			System.out.println(".............");
		}
	}

}
