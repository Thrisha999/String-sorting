import java.util.*;
import java.util.Scanner;
class String_sort
{
    public static void main(String[] args)
    {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        s=sc.nextLine();
        char[] c = s.toCharArray();
        Arrays.sort(c);
        for(char t:c)
        {
            System.out.println(t);
        }
    }
}