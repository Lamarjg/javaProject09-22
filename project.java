package classProject1;

import java.util.Scanner;

public class project {

	public static void main(String[] args) {
	
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter First Name, numberical month, and day");
		
		String firstName = myObj.nextLine();
		
		//Scanner myObj2 = new Scanner(System.in);
		//System.out.println("Enter your favortie three digit Number");
		
		int num1 = myObj.nextInt();
		int num2 = myObj.nextInt();
		
		System.out.println("The first letter of your name is " + firstName.charAt(0));
		System.out.println("This is the amount of letters your name contains  " + firstName.length());
		System.out.println("The first letter of your name is " + firstName.charAt(firstName.length()-1));
		System.out.println("This is your name in uppercase "  +  firstName.toUpperCase());
		System.out.println("This is your name in uppercase "  +  firstName.toLowerCase());
		
				
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		System.out.println(num1 + "-" + num2 + "="  + (num1 - num2));
		System.out.println(num1 + "*" + num2 + "*" + (num1 * num2));
		System.out.println(num1 + "/" + num2 + "/"+ (num1 / num2));
		System.out.println(num1 + "%" + num2 + "%" + (num1 % num2));
		
		
		



				

		
		

		
	}

}

