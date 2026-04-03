package Javaprograms;

import java.util.Scanner;

public class GreatestNumber03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("enter number 1");
			
			double num1 = sc.nextDouble();
			System.out.println("enter number 2");
			double great = num1;
			double num2 = sc.nextDouble();
			great = great >num2 ? great : num2;
			System.out.println("enter number 3");
			double num3 = sc.nextDouble();
			
			great = great >num3 ? great : num3;
			System.out.println("greatest of all three  " + great);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error"+e);
		}finally {
			sc.close();
			
		}
	}

}
