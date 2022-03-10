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
		//calculate the length
		double len = Math.sqrt((X2-X1)*(X2-X1)+(Y2-Y1)*(Y2-Y1));
		System.out.println("Length of line : " +len);

	}

}
