import java.util.*;
public class arr_linear_scr
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner (System.in);
        int i,k=0,ns,p=0;
        int arr[]=new int[10];
        for(i=0;i<10;i++)
        {
            System.out.println(" ENTER NUMBERS IN THE CELL :");
            arr[i]=sc.nextInt();
        }
        System.out.println(" ELEMENT TO BE SCEARCHED :");
        ns=sc.nextInt();
        for(i=0;i<10;i++)
        {
            if(arr[i]==ns)
            k=1;
            p++;
            break;
        }
        if(k==1)
        {
            System.out.println(" NUMBER "+ns+" FOUND AT POSITION "+p);
        }
        else
        {
            System.out.println(" GO AND MAKE FRENCH FRIES ");
        }
    }
}