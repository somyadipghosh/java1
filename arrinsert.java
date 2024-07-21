import java.util.*;
public class arrinsert
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,ele,pos;
        System.out.println(" ENTER THE LENGTH OF AN ARRAY : ");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println(" ENTER THE ARRAY ELEMENTS : ");
            arr[i]=sc.nextInt();
        }
        System.out.println(" ENTER THE ELEMENT TO BE INSERTED : ");
        ele=sc.nextInt();
        System.out.println(" ELEMENT POSTION WHAT ? ");
        pos=sc.nextInt();
        for(i=n-1;i>=pos;i--)
        arr[pos]=arr[i];
        n++;
        System.out.println(" ARRAY AFTER CONSTRUCTION :");
        for(i=0;i<n;i++)
        System.out.println(arr[i]);
    }
}