package co.grandcircus;

import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean keepGoing;
		
		System.out.println("Learn your squares, cubes, and times tables!");
		System.out.println();
		
		do {
			System.out.println("Please enter an integer: ");
			int input = scan.nextInt();
			scan.nextLine();
			
			printFormattedLine("Number", "Squared", "Cubed");
			printFormattedLine("=======", "=======", "=======");
			
			for(int i = 1; i <= input; i++) {
				printFormattedLine(Integer.toString(i), Integer.toString(findSquare(i)), Integer.toString(findCube(i)));
			}
			
			System.out.println("Continue? (y/n)");
			if (scan.nextLine().equalsIgnoreCase("y")) {
				keepGoing = true;
			}
			else {
				keepGoing = false;
			}
			
		} while (keepGoing);
		
		System.out.println("Here is a multiplication table before you go!");
		System.out.println();
		showMultTable();
		
		scan.close();
	}
	
	public static int findSquare(int num) {
		int result = num * num;
		return result;
	}
	
	public static int findCube(int num) {
		int result = num * num * num;
		return result;
	}
	
	public static int findMult(int num, int otherNum) {
		return num * otherNum;
	}
	
	public static void printFormattedLine(String val1, String val2, String val3) {
		System.out.printf("%-10s", val1);
		System.out.printf("%-10s", val2);
		System.out.printf("%-10s", val3);
		System.out.println();
	}
	
	public static void showMultTable() {
		int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		for (int i : numbers) {
			for (int j : numbers) {
				System.out.printf("%-3s", i * j + " ");
			}
			System.out.println();
		}
	}
	
	
}
