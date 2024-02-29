//N==2 pow(x)

import java.util.Scanner;
import java.io.*;
public class Main
{
  public static void main (String[]args)
  {
	Scanner sc = new Scanner (System.in);
	int n = sc.nextInt ();
	  System.out.println (powerOf (n));
  }
  static boolean powerOf (int n)
  {
	return ((n & (n - 1))==0);
  }
}
