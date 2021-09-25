/* String compression(Gives the count of characters in the string)
 input: ranjith
output: a-1
        h-1
        i-1
        j-1
        n-1
        r-1
        t-1     */

import java.util.*;
class Main 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] str = s.toCharArray();
        int[] f = new int[26];
        Arrays.fill(f,0);
        for(int i = 0;i < str.length;i++)
        {
            f[str[i] - 'a']++;
        }
        for(int i = 0;i < 26;i++)
        {
            if(f[i] != 0)
            {
                System.out.println((char)(i + 'a') + "-" + f[i]);
            }
        }
    }
}
