//Madison Rutledge


import java.util.*;

public class UserInput2
{
	public static void main(String[] args){

	Scanner in = new Scanner(System.in);

		System.out.println("What is your full name? I need it for legal reasons.");
		String name = in.nextLine();
		int first = name.indexOf(' ');
		String fname = name.substring(0,first);

		System.out.println("How many apples do you wanna buy kid?");
		double apples = in.nextInt();

		System.out.println("How much do you think these premium apples cost?");
		double cost = in.nextInt();

		double totalcost = apples * cost;

		String message = "Hi " + first + ", you are buying " + apples + " at $" + cost + " for a total of $" + totalcost + ".";
		System.out.println(message);
	}
}