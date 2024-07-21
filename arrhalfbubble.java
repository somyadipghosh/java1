import java.util.*;
public class arrhalfbubble
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j=0;
        int arr[]=new int[20];
        System.out.println("Enter 20 numbers in the array");
        for( i=0;i<20;i++)
        {
            arr[i]=sc.nextInt();
        }
        //SORT HALF IN ASCENDING ORDER
        for(i=0;i<20/2-1;i++)
        {
            for(j=0;j<20/2-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=t;
                }
            }
        }
        //PRINT THE FINAL SORTED ARRAY
        System.out.println("\nSorted Array : ");
        for(i=0;i<arr.length;i++)
        {
            System.out.println(arr[j]+" ");
        }
    }
}