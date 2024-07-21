import java.util.*;
public class APC_Str_17
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int i,l,c=0;
        System.out.print("Enter a string: ");
        s=sc.nextLine();
        l=s.length();
        for(i=0;i<l-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            c++;
        }
        System.out.println("Double letter Sequence: "+c);
    }
}