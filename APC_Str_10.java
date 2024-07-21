import java.util.*;
public class APC_Str_10
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s,temp="";
        System.out.print("Enter a Sentence: ");
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
        for(i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch==' '||ch=='.'||ch==','||ch=='!'||ch=='?')
            {
                word[k]=temp;
                temp="";
                k++;
            }
            else
            temp+=ch;
        }
        for(i=k-1;i>=0;i--)
        System.out.print(word[i]+" ");
    }
}