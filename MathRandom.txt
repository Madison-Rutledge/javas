//Madison Rutledge

import java.util.*;

public class MathRandom
{
	public static void main(String[] args){

		Scanner in = new Scanner(System.in);

		System.out.println("I need two numbers from you,");

		System.out.println("so give me the first one.");
		int one = in.nextInt();
		System.out.println("Now give me the second one.");
		int two = in.nextInt();

		int three = (int) (Math.random() * one) + two;
		System.out.println(three);
	}
}