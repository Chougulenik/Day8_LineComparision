package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter X1 & Y1 co-ordinates");
		int X1 = input.nextInt();
		int Y1 = input.nextInt();
		System.out.println("Enter X2 & Y2 co-ordinates");
		int X2 = input.nextInt();
		int Y2 = input.nextInt();
		//calculate the length1
		Integer length1 =(int)Math.sqrt((X2-X1)*(X2-X1)+(Y2-Y1)*(Y2-Y1));
		
		System.out.println("Enter X3 & Y3 co-ordinates");
		int X3 = input.nextInt();
		int Y3 = input.nextInt();
		System.out.println("Enter X4 & Y4 co-ordinates");
		int X4 = input.nextInt();
		int Y4 = input.nextInt();
		//calculate the length2
		Integer length2 = (int)Math.sqrt((X2-X1)*(X2-X1)+(Y2-Y1)*(Y2-Y1));
		
		System.out.println("Length of line : " +length1);
		System.out.println("Length of line : " +length2);

		if(length1.equals(length2))
			System.out.println("Length1 is equal to Length2");
		else
			System.out.println("Length1 is not equal to Length2");

	}

}
