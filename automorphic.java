import java.util.*;
public class automorphic
{
    public static void main()
    {
        int x,r,f=1,n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number");
        x=sc.nextInt();
        n=x;
        while(x!=0)
        {
            x=x/10;
            f=f*10;
        }
        if((n*n)%f==n)
        System.out.println("Automorphic number");
        else
        System.out.print("Not Automorphic number");
    }
}