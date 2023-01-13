//Madison Rutledge 

import java.util.*; 
import java.io.*; 
import java.util.ArrayList; 
import java.util.Arrays;
import java.io.*;

public class ExceptionTryAgain { 
  public static void main(String[] args) throws IOException { 
  Scanner in = new Scanner(System.in); 
  ArrayList<Integer> hold = new ArrayList<Integer>(); 
  boolean test = false;
  String fname = "";
  
  while (test == false) {
    try {  
      //System.out.println("Give me a filename"); 
      fname = in.nextLine();
      Scanner temp = new Scanner(new File(fname)); 
    } 
    catch (FileNotFoundException e) { 
      //return
      test = false;
      //System.out.println(test);
      continue;
    } 
    test = true;
   // System.out.println(test);
  }

  Scanner fin = new Scanner(new File(fname));
  int sum = 0;
  int doublelines = 0;
  int stringlines = 0;
  
  while (fin.hasNextLine()) { 
    String line = fin.nextLine(); 
    String trimmed = line.trim(); 
      
    try { 
      if (trimmed.contains(".")) {
        double temp1 = trimmed;
        int temp2 = (int)temp1;
        hold.add(temp2);
        doublelines++;
        sum += temp2;
        //System.out.println(hold); 
      }
      else {
        int parse = Integer.parseInt(trimmed); 
        hold.add(parse); 
        sum += parse;
        //System.out.println(hold); 
      }
    } 
    catch (NumberFormatException e) { 
      int strlen = trimmed.length;
      hold.add(strlen);
      stringlines++;
      sum += strlen;
      //System.out.println(hold);
    } 

    if(hold.get(0) == hold.size()) {
      //do nothing ig *shrug*
    }
    else {
      System.out.println("The value in the file is not representative of the amount of data");
    }

  } 

  //System.out.println(hold);
  System.out.println("Sum of values: " sum);
  System.out.println("Number of doubles read in as ints: " + doublelines);
  System.out.println("Number of non-numeric values: " + stringlines);
    
  }
}