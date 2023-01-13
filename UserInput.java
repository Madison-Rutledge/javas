//Madison Rutledge

import java.util.*;

public class UserInput
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		System.out.println("What is your name?");
		String name = in.nextLine();

		System.out.println("How old are you?");
		int age = in.nextInt();

		String message = "Hello " + name + ", you will be " + (age + 30) + " in 30 years.";
		System.out.println(message);
	}
}