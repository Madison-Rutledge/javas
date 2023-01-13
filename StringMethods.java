//Madison Rutledge

public class StringMethods
{
	public static void main(String[] args){
		String first = "Madison";
		String last = "Rutledge";
		String full = first + " " + last;
			System.out.println(full);
				int length = full.length();

		String threes = full.substring(0,3);
			System.out.println(threes);

		String three = full.substring(length - 3);
			System.out.println(three);

		char four = full.charAt(4);
			System.out.println(four);

		int pos = full.indexOf(' ');
				System.out.println(pos);
	}
}