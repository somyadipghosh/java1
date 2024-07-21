import java.util.*;
public class arrEVOD
{
    public void disp(int a[],int n)
    {
        int i;
        for(i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
    public void main()
    {
        int n,i,x=0,y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        y=n-1;
        int arr[]=new int[n];
        int arrn[]=new int[n];
        System.out.println("Enter array elements");
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        
        for(i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                arrn[x]=arr[i];
                x++;
            }
            else
            {
                arrn[y]=arr[i];
                y--;
            }
        }
        System.out.println("Original array");
        disp(arr,n);
        System.out.println("Modified array");
        disp(arrn,n);
    }
}