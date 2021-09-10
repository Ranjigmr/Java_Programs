/* Number Palindrome or not
input: 12321
output: Number is Palindrome  */

import java.util.*;
class Main
{
	public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int copy = number;
        int rem;
        int sum = 0;
        while(copy != 0)
        {
        	rem = copy % 10;
            sum = sum*10 + rem;
            copy /= 10;
        }
        if(number == sum)
        {
        	System.out.println("Number is Palindrome");
        }
        else
        {
        	System.out.println("Number is not Palindrome");
        }
    }
}
