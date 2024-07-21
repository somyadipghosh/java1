import java.util.*;
public class arr_sel_sort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        int i,j,t=0,min;
        for(i=0;i<10;i++)
        {
            System.out.println(" ENTER THE NUMBER OF CELLS IN THE ARRAY : ");
            arr[i]=sc.nextInt();
        }
        for(i=0;i<9;i++)
        {
            min=i;
            for(j=i+1;j<10;j++)
            {
                if(arr[j]<arr[min])
                min=j;
            }
            t=arr[i];
            arr[i]=arr[min];
            arr[min]=t;
        }
        System.out.println(" ARRAYS AFTER SORTING : ");
        for(i=0;i<10;i++)
        System.out.println(arr[i]);
    }
}