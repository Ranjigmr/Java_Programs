/* String expansion for single integer format
 input: a2b3c4
output: aabbbcccc    */

import java.util.*;
class Main 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] str = s.toCharArray();
        for(int i = 0,j = 1;i < str.length;i = i + 2,j = j + 2)
        {
            int num = Integer.valueOf(str[j]);
            num = num - 48;
            for(int k = 0;k < num;k++)
            {
                System.out.print(str[i]);
            }
        }
    }
}
