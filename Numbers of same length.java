/* 0 to 0 (Gets the length of last digit and prints all the digits from start to end with the same length)
input : 1 10
output : 01 02 03 04 05 06 07 08 09 10 */

import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int start = sc.nextInt();
	    int end = sc.nextInt();
	     int n = end;
	     int rem,len = 0;
        while(n > 0)
        {
            rem = n % 10;
            n /= 10;
            len++;
        }
	    for(int i = start;i <= end;i++)
	    {
	        System.out.format("%0"+len+"d ",i);
	    }
	}
}
