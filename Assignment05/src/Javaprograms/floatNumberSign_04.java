package Javaprograms;

import java.util.Scanner;

public class floatNumberSign_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter floating number");
			double num = sc.nextDouble();
			if(num == 0) {
				System.out.println("Zero");
			}else {
				String res = num>0 ? "Positive" : "Negative";
				double abs = Math.abs(num);
				if (abs < 1) {
				    res = "Small " + res;
				} else if (abs > 1000000) {
				    res = "Large " + res;
				}
				System.out.println(res);
				}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error "  + e);
		}
	}

}
