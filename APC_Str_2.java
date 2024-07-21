import java.util.*;
public class APC_Str_2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s,s1="";
        int i,l;
        System.out.print(" ENTER A SENTENCE : ");
        s=sc.nextLine();
        l=s.length();
        s=s.toUpperCase( );
        for(i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            s1+=(char)(ch+1);
            else
            s1+=ch;
        }
        System.out.println(s1);
    }
}