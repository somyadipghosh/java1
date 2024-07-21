import java.util.*;
public class amstrong
{
    public static void main()
    {
        int x,r,s=0,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a numer");
        x=sc.nextInt();
        n=x;
        while(x!=0)
        {
            r=x%10;
            x=x/10;
            s=s+r*r*r;
        }
        if(n==s)
        System.out.println("Amstrong number");
        else
        System.out.println("Not any number");
    }
}