/* Prime number or not
input: 97
output: 97 is a prime number    */

import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int number = sc.nextInt();
	    int count = 0;
    	for(int index = 1; index <= number; index++)
    	{
    	    if(number%index==0)
    	        count++;
    	}
    	if(count==2)
            System.out.print(number+" is a prime number");
        else
            System.out.print(number+" is not a prime number");
	}
}
