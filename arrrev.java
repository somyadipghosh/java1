import java.util.*;
public class arrrev
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int i,t,k=9,n=10;
        for(i=0;i<10;i++)
        {
            System.out.println("Enter number: ");
            a[i]=sc.nextInt();
        }
        for(i=0;i<n/2;i++)
        {
            t=a[i];
            a[i]=a[k];
            a[k]=t;
            k--;
        }
        for(i=0;i<10;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}