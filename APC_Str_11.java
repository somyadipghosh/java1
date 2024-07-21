import java.util.*;
public class APC_Str_11
{
    public int vowelcount(String s)
    {
        int i,c=0;
        for(i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            c++;
        }
        return c;
    }
    public void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s,temp="";
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
        int m=0;
        for(i=0;i<k;i++)
        {
            if(m<vowelcount(word[i]))
            m=vowelcount(word[i]);
        }
        System.out.println("Words having maximum number of vowels: ");
        for(i=0;i<k;i++)
        {
            if(m==vowelcount(word[i]))
            System.out.println(word[i]);
        }
    }
}