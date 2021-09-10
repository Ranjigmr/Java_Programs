/* Leap year or not
input: 1977
output: 1977 is not a leap year */

import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int year = sc.nextInt();
	    if(((year%100!=0&&year%4==0)||year%400==0))
	        System.out.println(year + " is leap year");
	    else
	        System.out.println(year + " is not a leap year");
	}
}
