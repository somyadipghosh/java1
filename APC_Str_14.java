import java.util.*;
public class APC_Str_14
{
    public static void main(String args[])
    {
        String s;
        int l,i,c,f=0;
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        s=sc.nextLine();
        l=s.length();
        for(ch='A';ch<='Z';ch++)
        {
            c=0;
            for(i=0;i<l;i++)
            {
                char ch1=s.charAt(i);
                if(ch==ch1||ch+32==ch1)
                c++;
            }
            if(c>1)
            f=1;
        }
        if(f==0)
        System.out.println("Unique String");
        else
        System.out.println("Not Unique String");
    }
}