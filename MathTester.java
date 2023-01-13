//Madison Rutledge

import java.util.*;

public class MathTester
{
	public static void main(String[] args){

	Scanner in = new Scanner(System.in);

		System.out.println("Give me a number.");
		double absy = in.nextDouble();
		double a = Math.abs(absy);
		System.out.println("The absolute value of your number is " + a);

		System.out.println("Give me a floating point number.");
		double flot = in.nextDouble();
		double b = Math.floor(flot);
		System.out.println("The float value of your number is " + b);
		double c = Math.ceil(flot);
		System.out.println("The ceiling of your number is " + c);
		double d = Math.round(flot);
		System.out.println("The rounded value of your number is " + d);

		System.out.println("Give me number.");
		double one = in.nextDouble();
		System.out.println("Give me another number.");
		double two = in.nextDouble();
		double e = Math.max(one, two);
		System.out.println("The rounded value of your number is " + e);
		double f = Math.min(one, two);
		System.out.println("The bigger number of your two number is " + f);

		System.out.println("Give me a new number.");
		double three = in.nextDouble();
		System.out.println("Give me yet another new number.");
		double four = in.nextDouble();
		double g = Math.pow(three, four);
		System.out.println("The value of your first number to the power of your second number is " + g);


	}
}