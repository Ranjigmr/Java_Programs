/* Armstrong numbers in the given range
 input: 1 1000
output: 1 2 3 4 5 6 7 8 9 153 370 371 407     */

import java.util.*;
import java.lang.*;
public class Main
{
    static int isArmstrong(int num)
    {
        int rem,sum = 0,len = 0;
        int n = num;
        while(n > 0)
        {
            rem = n % 10;
            n /= 10;
            len++;
        }
        n = num;
		while(n > 0)
		{
			rem = n % 10;
			sum = sum + (int)Math.pow(rem,len);
			n = n / 10;
		}
		return sum;
    }
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		for(int i = start;i <= end;i++)
		{
		    if(isArmstrong(i) == i)
		    {
		        System.out.print(i+" ");
		    }
		}
	}
}
