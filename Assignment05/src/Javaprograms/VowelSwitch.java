package Javaprograms;

import java.util.Scanner;

public class VowelSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
          try {
        	  System.out.println("Enter a charcter");
        	  String s = sc.next();
        	  char c = s.charAt(0);
        	  if(s.length() > 1 || !Character.isLetter(c) ) {
        		  System.out.println("invalid  input ..");
        		  return;
        	  }
        	 switch(Character.toLowerCase(c)) {
        	 case 'a','e','i','o','u':
        		 System.out.println("vowel....");
        	     break;
        	 default :
        		 System.out.println("consonant");
        	 
        	 
        	 }
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error"+e);
		}finally {
			sc.close();
		}
	}
}
