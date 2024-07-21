import java.util.*;
public class APC_Str_1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s="";
        int i,c1=0,c2=0,c3,l;
        System.out.print("ENTER A SENTENCE WITHOUT SPACE AND SPECIAL CHARACTERS : ");
        s=sc.nextLine();
        l=s.length();
        s=s.toUpperCase( );
        for(i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch ==' '&& ch+1!=' ')
            c1++;
            if(ch>='A'&&ch<='Z')
            c2++;
        }
        System.out.println("NO. OF LETTERS : "+c2);
        System.out.println("NO. OF WORDS : "+c1);
    }
}