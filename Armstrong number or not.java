// Armstrong number or not for all digit numbers

import java.util.*;
import java.lang.*;
public class Main
{
    static boolean isArmstrong(int num)
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
		if(sum == num)
		{
		    return true;
		}
		return false;
    }
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(isArmstrong(num))
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not an Armstrong Number");
		}
	}
}
