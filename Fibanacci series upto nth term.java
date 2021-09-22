/* Fibanacci series upto nth term
 input: 8
output: 0 1 1 2 3 5 8 13    */

import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int num1 = 0,num2 = 1,num3;
	    for(int i = 0;i < n;i++)
	    {
	        System.out.print(num1+" ");
	        num3 = num1 + num2;
	        num1 = num2;
	        num2 = num3;
	    }
	}
}
