import java.util.*;
public class alphabetcnt
{
    public static void main(String args[])
    {
        String s;
        int l,i,c;
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
                if(ch==ch1 || ch+32==ch1)
                c++;
            }
            if(c!=0)
            System.out.println(ch+"\t"+c);
        }
    }
}