/* Remove the spaces from a String 
 input: Dim is a genius
output: Dimisagenius     */

import java.util.*;
class Main 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(" ");
        s = "";
        for(int i = 0;i < str.length;i++)
        {
            s += str[i];
        }
        System.out.println(s);
    }
}
