package com.avishagsaban.mathchallenges.maxPrimeSum;

import java.util.Scanner;



public class Main {
	static Scanner myScanner = new Scanner(System.in);  // Create a Scanner object

	public static void main(String[] args) {
		Main.runMenu();	
		System.out.println("done");
	}
	public static void runMenu() {
		int choice = 0; 
		choice = Main.safeMenuChoice();
		while(choice!=0) {
			switch(choice) {
				case 1: { Main.runChallenge(); break;}
				case 2: { 
				System.out.println("using formula: "+sum3MultN5Mults.getSumFormula()+"\nusing module: "+sum3MultN5Mults.getSumBruteForce()+"\nusing table: "+sum3MultN5Mults.getSumList());
						}
			}
			
			choice = Main.safeMenuChoice();
			
		}
	}
	public static void runChallenge() {
		int numIter=0;
		System.out.println("Please enter your max iterations which is an integer");
		numIter = Main.safeIntegerInput();
		MaxSumPrime msp = new MaxSumPrime(numIter);
		System.out.println(msp.getMaxSumPrimeVal());
	}
	public static int safeMenuChoice() {
		int choice = -1;
		while(choice<0 || choice>2 ) {
			System.out.println("please choose:\n 1 - max prime challenge\n 2 - sum 3 mults and 5 mults (euler 1) \n 0 - exit");
			choice = Main.safeIntegerInput();
			if(choice >2) {
				System.out.println("invalid choice");
			}
		}
		return choice;
	}
	public static int safeIterChoice() {
		int choice = -1;
		while(choice<0) {
			choice = Main.safeIntegerInput();
			System.out.println("invalid choice, choose a non negative integer");
		}
		return choice;
	}
	public static int safeIntegerInput() {
		int integer =0;
		boolean flag = false;
		while(!flag) {
			try{
				integer = myScanner.nextInt();
				flag = true;
			}catch (Exception e) {
				System.out.println("enter a positive integer no bigger than 2147483647");
				myScanner.nextLine();
				
			}
		}
		return integer;
	}

}
