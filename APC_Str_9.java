import java.util.*;
public class APC_Str_9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s,temp="",r="";
        System.out.print("Enter a sentence: ");
        s=sc.nextLine();
        int i,c=0,k=0,l;
        l=s.length();
        for(i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==' '||ch=='.'||ch==','||ch=='!'||ch=='?')
            c++;
        }
        String word[]=new String[c];
        String rev[]=new String[c];
        for(i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch==' '||ch=='.'||ch==','||ch=='!'||ch=='?')
            {
                word[k]=temp;
                rev[k]=r;
                temp="";
                r="";
                k++;
            }
            else
            {
                temp+=ch;
                r=ch+r;
            }
        }
        for(i=0;i<k;i++)
        {
            if(word[i].equals(rev[i]))
            System.out.println(word[i]);
        }
    }
}