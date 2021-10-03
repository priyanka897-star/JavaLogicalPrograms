package com.bl.logicalprograms;

import java.util.Scanner;

public class FibnocciSeries {

	public static void printFibonacci(int number) {

		int firstTerm = 0, secondTerm = 1, finalTerm = 0;
		System.out.print(firstTerm + " " + secondTerm + " ");
		for (int i = 2; i <= number; i++) {
			finalTerm = firstTerm + secondTerm;
			System.out.print(finalTerm + " ");
			firstTerm = secondTerm;
			secondTerm = finalTerm;
		}
	}

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		int  number;
		System.out.println("Enter the nth value: ");
		number = scanner.nextInt();
		scanner.close();
		System.out.println("Fibonacci series: ");
        printFibonacci(number);
	}

}