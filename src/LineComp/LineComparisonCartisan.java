package LineComp;

import java.util.Scanner;

public class LineComparisonCartisan {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Line Comparison Computation Program");
		interact1();
		interact2();
	}
	private static void interact1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the x-coordinate of 1st point");
		int x1=sc.nextInt();
		System.out.println("Enter the y-coordinate of 1st point");
		int y1=sc.nextInt();
		System.out.println("Enter the x-coordinate of 2nd point");
		int x2=sc.nextInt();
		System.out.println("Enter the y-coordinate of 2nd point");
		int y2=sc.nextInt();
		System.out.println("Lenth of line is "+lengthOfLine(x1, x2, y1, y2));
	}
	private static void interact2() {
		Scanner sc=new Scanner(System.in);
		double length_line[]=new double[2];
		for(int i=0;i<2;i++) {
			System.out.println("For Line "+(i+1));
			System.out.println("Enter the x-coordinate of 1st point");
			int x1=sc.nextInt();
			System.out.println("Enter the y-coordinate of 1st point");
			int y1=sc.nextInt();
			System.out.println("Enter the x-coordinate of 2nd point");
			int x2=sc.nextInt();
			System.out.println("Enter the y-coordinate of 2nd point");
			int y2=sc.nextInt();
			length_line[i]=lengthOfLine(x1, x2, y1, y2);
		}
		if(length_line[0]==(length_line[1]))
			System.out.println("The lines are equal in length.");
		else
			System.out.println("The lines are unequal in length.");
	}

	
	private static double lengthOfLine(int x1,int x2,int y1, int y2) {
		double length=Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
		return length;
	}
}
