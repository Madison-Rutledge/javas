//Madison Rutledge

import java.util.*;

public class Grades
{
public static void main(String[] args){

Scanner in = new Scanner(System.in);

	System.out.println("Give me your grade.");
	double grade = in.nextDouble();

	if (90 <= grade && grade <= 100) {
    System.out.println("You have an A.");
	}
	else if (80 <= grade && grade < 90) {
    System.out.println("You have a B.");
	}
	else if (75 <= grade && grade < 80) {
    System.out.println("You have a C.");
	}
	else if (70 <= grade && grade < 80) {
    System.out.println("You have a D.");
	}
	else if (grade < 70) {
    System.out.println("You have a F.");
  }}
}
