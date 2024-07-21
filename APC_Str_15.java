import java.util.*;
public class APC_Str_15
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i;
        long l,j,k,sum,r;
        String s,s1="";
        System.out.print("Enter a string: ");
        s=sc.nextLine();
        s=s.toUpperCase();
        System.out.println(s);
        l=s.length();
        for(i=0;i<l;i++)
        {
            j=s.charAt(i)-64;
            s1=s1+j;
        }
        System.out.println(s1);
        long p=Long.parseLong(s1);
        System.out.println(p);
        while(p>9)
        {
            sum=0;
            while(p!=0)
            {
                r=p%10;
                p=p/10;
                sum+=r*r;
            }
            p=sum;
            System.out.println(p);
        }
        if(p==1)
        System.out.println("Happy word");
        else
        System.out.println("Not happy word");
    }
}