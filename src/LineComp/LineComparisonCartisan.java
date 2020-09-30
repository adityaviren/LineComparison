package LineComp;

import java.util.Scanner;

public class LineComparisonCartisan {
	public static void main(String args[]) {
		System.out.println(input1());
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

	private static double lengthOfLine(int x1, int x2, int y1, int y2) {
		double length = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		return length;
	}
}
