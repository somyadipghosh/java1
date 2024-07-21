import java.util.*;
public class arr_fibonacci
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        int i;
        a[0]=0;
        a[1]=1;
        for(i=2;i<10;i++)
        a[i]=a[i-1]+a[i-2];
        System.out.println("The series ");
        for(i=0;i<10;i++)
        System.out.println(a[i]+" ");
    }
}