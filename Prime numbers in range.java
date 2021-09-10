/* Prime numbers in range
input: 10 100
output: 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97      */

import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int count;
		for(int i = start ; i <= end ; i++)
		{
			count = 0;
			for(int j = 1 ; j <= i ; j++)	
			{
				if(i % j == 0)
					count++;
			}
			if(count == 2)
				System.out.print(i+" ");
		}
	}
}
