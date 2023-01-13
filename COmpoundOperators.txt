//Madison Rutledge

import java.util.*;

public class CompoundOperators
{
	public static void main(String[] args){

		Scanner in = new Scanner(System.in);

		System.out.println("Give me a whole number.");
		int whole = in.nextInt();
		whole *= 14;
		System.out.println(whole);
		whole += 21;
		System.out.println(whole);
		whole /= 7;
		System.out.println(whole);
		whole -= 3;
		System.out.println(whole);
		whole++;
		System.out.println(whole);
		whole--;
		System.out.println(whole);

	}
}