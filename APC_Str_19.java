import java.util.*;
public class APC_Str_19
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s,temp="",s1;
        int i,j,k=0,l,c=0;
        System.out.print("Enter three strings: ");
        s=sc.nextLine();
        l=s.length();
        for(i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch==' '||ch==','||ch=='.'||ch=='?'||ch=='!')
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
        for(i=0;i<k;i++)
        {
            s1=word[i];
            int f=0;
            for(j=0;j<s1.length()-1;j++)
            {
                if(s1.charAt(j)+1==s1.charAt(j+1))
                f=1;
            }
            if(f==1)
            System.out.println(s1);
        }
    }
}