package Javaprograms;

import java.time.LocalDate;
import java.util.Scanner;

public class NumberOfDaysOfMonth {


	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		try {
			System.out.println("Enter a month number:..");
			int month = sc.nextInt();
			System.out.println("Enter a year number:..");
			int year = sc.nextInt();
			 LocalDate date =  LocalDate.of(year,month,1);
			 System.out.println(date.lengthOfMonth());

			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error "+ e);
		}finally {
			sc.close();
		}
				
		
		
	}

}
