import java.util.*;
public class arr_binary_scr
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner (System.in);
        int i,k=0,p=0,ns,lb=0,ub=9;
        int arr[]=new int[10];
        for(i=0;i<10;i++)
        {
            System.out.println(" ENTER WORDS IN THE ARRAY : ");
            arr[i]=sc.nextInt();
        }
        System.out.println(" ENTER THE NUMBER TO BE SCEARCHED : ");
        ns=sc.nextInt();
        while(lb<=ub)
        {
            p=(lb+ub)/2;
            if(arr[p]<ns)
            lb=p+1;
            if(arr[p]>ns)
            ub=p-1;
            if(arr[p]==ns)
            {
                k=1;
                break;
            }
        }
        if(k==1)
        System.out.println("Search sucessfull");
        else
        System.out.println("Search unsucessfull");
    }
}