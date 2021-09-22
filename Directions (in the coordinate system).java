// Directions (in the coordinate system)

import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int x = 0,y = 0;
	    int distance = 10;
	    char ch ='R';
	    while(n > 0)
	    {
	        switch(ch)
	        {
	            case 'R':
	                x = x + distance;
	                ch = 'U';
	                distance += 10;
	                break;
	            case 'U':
	                y = y + distance;
	                ch = 'L';
	                distance += 10;
	                break;
	            case 'L':
	                x = x - distance;
	                ch = 'D';
	                distance += 10;
	                break;
	            case 'D':
	                y = y - distance;
	                ch = 'R';
	                distance += 10;
	                break;
	        }
	        n--;
	    }
	    System.out.println(x+","+y);
	}
}
