package programming;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==================================");
		System.out.println("====<<<<<<< Welcome to >>>>>>>====");
		System.out.println("====<<<< Simple Calculator >>>>====");
		System.out.println("==================================");
		System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        System.out.println("5: Modulus");
		System.out.println("Enter the Choice :");
		int Choice=sc.nextInt();
		if(Choice==1) {
			System.out.println("You have Choose to Addition :");
			System.out.println("Enter the First number :");
			int n1=sc.nextInt();
			System.out.println("Enter the Second number :");
			int n2=sc.nextInt();
			int n3=n1+n2;
			System.out.println("Addition of the two Numbers "+n1+" and "+n2+" is "+n3);
		}
		else if(Choice==2) {
			System.out.println("You have Choose to Subtraction :");
			System.out.println("Enter the First number :");
			int n1=sc.nextInt();
			System.out.println("Enter the Second number :");
			int n2=sc.nextInt();
			int n3=n1-n2;
			System.out.println("Subtraction of the two Numbers "+n1+" and "+n2+" is "+n3);
		}
		else if(Choice==3) {
			System.out.println("You have Choose to Multiplication :");
			System.out.println("Enter the First number :");
			int n1=sc.nextInt();
			System.out.println("Enter the Second number :");
			int n2=sc.nextInt();
			int n3=n1*n2;
			System.out.println("Multiplication of the two Numbers "+n1+" and "+n2+" is "+n3);
		}
		else if(Choice==4) {
			System.out.println("You have Choose to Division :");
			System.out.println("Enter the First number :");
			int n1=sc.nextInt();
			System.out.println("Enter the Second number :");
			int n2=sc.nextInt();
			int n3=n1/n2;
			System.out.println("Division of the two Numbers "+n1+" and "+n2+" is "+n3);
		}
		else if(Choice==5) {
			System.out.println("You have Choose to Modulus :");
			System.out.println("Enter the First number :");
			int n1=sc.nextInt();
			System.out.println("Enter the Second number :");
			int n2=sc.nextInt();
			int n3=n1%n2;
			System.out.println("Modulus of the two Numbers "+n1+" and "+n2+" Remainder is "+n3);
		}
		else {
			System.out.println("Invalid Data");
		}
		System.out.println();
		System.out.println("===========================================");
		System.out.println("====<<<<<<< Thank you for using >>>>>>>====");
		System.out.println("====<<<<<<<< Simple Calculator >>>>>>>>====");
		System.out.println("===========================================");
		sc.close();
		
	}

}
