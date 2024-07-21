import java.util.*;
public class APC_Str_12
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s,temp="",s1,s2;
        System.out.println(" enter a sentence ");
        s=sc.nextLine();
        int i,c=0,k=0,l;
        l=s.length();
        for(i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch==' '||ch=='.'||ch=='?'||ch=='!'||ch==',')
            c++;
        }
        String word[]=new String[c];
        for(i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch==' '||ch=='.'||ch=='?'||ch=='!'||ch==',')
            {
                word[k]=temp;
                temp="";
                k++;
            }
            else
            temp+=ch;
        }
        System.out.println("ENTER WORD TO SCEARCH : ");
        s1=sc.next();
        System.out.println("ENTER WORD TO REPLACE : ");
        s2=sc.next();
        for(i=0;i<k;i++)
        {
            if(word[i].equals(s1))
            word[i]=s2;
        }
        for(i=0;i<k;i++)
        System.out.println(word[i]+" ");
    }
}