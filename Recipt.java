//Madison Rutledge

import java.util.*;

public class Recipt
{
	public static void main(String[] args){

		Scanner in = new Scanner(System.in);

		final double tax = 0.0825;

		System.out.println("Can I have your full name?");
		String name = in.nextLine();
		int space = name.indexOf(' ');
		String first = name.substring(0,space);


		System.out.println("How much does a cheese pizza cost?");
		double cheese = in.nextDouble();

		System.out.println("How much does a pepperoni pizza cost?");
		double pepperoni = in.nextDouble();

		int noofc = (int) (Math.random() * 4) + 1;
		int noofp = (int) (Math.random() * 4) + 1;

		double subcheeses = cheese * noofc;
		double subpepperonis = pepperoni * noofp;

		double subtotal = subcheeses + subpepperonis;
		double addtax = subtotal * tax;
		double total = subtotal + addtax;

		System.out.printf("Order for: %14s%n", first);
		System.out.printf("\nCashier: %s%n", "Madison Rutledge");
		System.out.printf("\nCheese Pizza: %11s%n", subcheeses);
		System.out.println("\t"+ noofc + " @ " + cheese);
		System.out.printf("\nPepperoni Pizza: %8s%n", subpepperonis);
		System.out.println("\t"+ noofp + " @ " + pepperoni);
		System.out.printf("\nSubtotal: %15s%n", subtotal);
		System.out.printf("Tax: %20.2f", addtax);
		System.out.printf("\nTotal: %18.2f", total);

	}
}