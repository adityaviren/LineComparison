package LineComp;

import java.util.Scanner;

public class LineComparisonCartisan {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Line Comparison Computation Program\nEnter 1 to calculate length of line"
				+ "\nEnter 2 to check if the length of 2 lines are equal"
				+ "\nEnter 3 to compare the length of 2 lines");
		int user_option = sc.nextInt();
		switch (user_option) {
		case 1:
			System.out.println("Length of line is " + input1());
			break;
		case 2:
			equalsToLineLength();
			break;
		case 3:
			compareToLineLength();
			break;
		default:
			break;
		}
		sc.close();

	}

	private static double input1() {
		Scanner sc = new Scanner(System.in);
		double length_of_line;
		System.out.println("Enter the x-coordinate of 1st point");
		int x1 = sc.nextInt();
		System.out.println("Enter the y-coordinate of 1st point");
		int y1 = sc.nextInt();
		System.out.println("Enter the x-coordinate of 2nd point");
		int x2 = sc.nextInt();
		System.out.println("Enter the y-coordinate of 2nd point");
		int y2 = sc.nextInt();
		length_of_line = lengthOfLine(x1, x2, y1, y2);
		return length_of_line;
	}

	private static void compareToLineLength() {
		Double length_line[] = new Double[2];
		for (int i = 0; i < 2; i++) {
			System.out.println("For Line " + (i + 1));
			length_line[i] =(input1());
		}
		int check_compareTO = length_line[0].compareTo(length_line[1]);
		if (check_compareTO == 0)
			System.out.println("The lines are equal in length.");
		else if (check_compareTO < 0)
			System.out.println("Line 2 is longer than Line 1");
		else
			System.out.println("Line 1 is longer than Line 1");
	}

	private static void equalsToLineLength() {
		Double length_line[] = new Double[2];
		for (int i = 0; i < 2; i++) {
			System.out.println("For Line " + (i + 1));
			length_line[i] = (input1());
		}
		if (length_line[0].equals(length_line[1]))
			System.out.println("The lines are equal in length.");
		else
			System.out.println("The lines are unequal in length.");
	}

	private static double lengthOfLine(int x1, int x2, int y1, int y2) {
		double length = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		return length;
	}
}