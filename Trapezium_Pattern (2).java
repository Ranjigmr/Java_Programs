/* Trapezium pattern
input: 4
output: 1*2*3*4*17*18*19*20
          5*6*7*14*15*16
            8*9*12*13
              10*11 */

import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt();
    int t = a;
    int c = 1, i, j, k = 1, s, z = 0, x;
    for (i = a; i >= 1; i--, System.out.println())
    {
	    for (x = t; x > i; x--)
	    {
	        System.out.print("  ");
	    }
	    for (j = 1; j <= i; j++)
	    {
	        System.out.printf("%d*", c++);
	    }
	    for (j = 1; j <= i; j++)
	    {
	        if (j == i)
	            System.out.printf("%d ", ((a * a) + k++));
	        else
	            System.out.printf("%d*", ((a * a) + k++));
	    }
	    a--;
    }
  }
}
