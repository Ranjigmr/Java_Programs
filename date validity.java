/* Date validity (Given date is valid or not)
input: 27 05 2020
output: Date is valid */

import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int date = sc.nextInt();
	    int month = sc.nextInt();
	    int year = sc.nextInt();
	    int flag = 0;
	    if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
	    {
	        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
	        {
	            if(date > 0 && date <= 31)
	            {
	                flag = 1;
	            }
	        }
	        if(month == 4 || month == 6 || month == 9 || month == 11)
	        {
	            if(date > 0 && date <= 30)
	            {
	                flag = 1;
	            }
	        }
	        if(month == 2)
	        {
	            if(date > 0 && date <= 29)
	            {
	                flag = 1;
	            }
	        }
	    }
	    else
	    {
	        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
	        {
	            if(date > 0 && date <= 31)
	            {
	                flag = 1;
	            }
	        }
	        if(month == 4 || month == 6 || month == 9 || month == 11)
	        {
	            if(date > 0 && date <= 30)
	            {
	                flag = 1;
	            }
	        }
	        if(month == 2)
	        {
	            if(date > 0 && date <= 28)
	            {
	                flag = 1;
	            }
	        }
	    }
	    if(flag == 1)
	    {
	        System.out.println("Date is valid");
	    }
	    else
	    {
	        System.out.println("Date is not valid");
	    }
	}
}
