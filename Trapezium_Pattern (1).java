/* Trapezium pattern
input: 4
output: 1*2*3*4*17*18*19*20
          5*6*7*14*15*16
            8*9*12*13
              10*11 */
            
import java.util.*;
public class Main 
{
	public static void trapeziumPattern(int num)
	{
		int a = 1;
		int b = (num * num) + 1;
		int spaces = 0;
		for (int i = num; i >= 1;i--) 
		{
			for (int s = spaces;s >= 1;s--) 
			{
				System.out.print(" ");
			}
			for (int j = 1;j <= i;j++) 
			{
				if (j == i)
					System.out.print((a++));
				else
					System.out.print((a++) + "*");
			}
			for (int k = 1;k <= i;k++)
			{
				System.out.print("*" + (b++));
			}
			System.out.println();
			spaces += 2;
			b = (b - 1) - ((i - 1) * 2);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		trapeziumPattern(n);
	}
}
