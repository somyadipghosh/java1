import java.util.*;
public class Amicable
{
    public static void main()
    {
        int x,y,s1=0,s2=0,i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        x=sc.nextInt();
        System.out.print("Enter a number:");
        y=sc.nextInt();
        for(i=1;i<x;i++)
        {
            if(x%i==0)
            s1+=i;
        }
        for(i=1;i<y;i++)
        {
            if(y%i==0)
            s2+=i;
        }
        if(x==s2 && y==s1)
        System.out.println("Amicable number");
        else
        System.out.println("Not Amicable number");

    }
}