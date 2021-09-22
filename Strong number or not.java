/* Strong number or not
input: 145 ===> 1 4 5 ===> 1! + 4! + 5! ===> 1 + 24 + 120 ===> 145
output: Strong number   */

import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int copy = n;
	    int rem,sum = 0;
	    while(copy > 0)
	    {
	        int fact = 1;
	        rem = copy % 10;
	        for(int i = 1;i <= rem;i++)
	        {
	            fact *= i;
	        }
	        sum += fact;
	        copy /= 10;
	    }
	    if(sum == n)
	    {
	        System.out.println("Strong number");
	    }
	    else
	    {
	        System.out.println("Not Strong number");
	    }
	}
}
