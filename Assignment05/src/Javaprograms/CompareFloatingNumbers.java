package Javaprograms;

import java.util.Scanner;

public class CompareFloatingNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter first floating point number1");
			double num1 = sc.nextDouble();
			System.out.println("Enter first floating point number 2");
			double num2 = sc.nextDouble();
			   if((int)(num1*1000) ==(int)(num2*1000)) {
				   System.out.println("they are same");
			   }else {
				   System.out.println("they are different");
			   }
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("errrorrr..."+e);
		}finally {
			sc.close();
		}
	}

}
