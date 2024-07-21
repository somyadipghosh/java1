public class arr_prime
{
    public static void main(String args[])
    {
        int a[]=new int[30];
        int i=2,j,c=0,x;
        while(c<30)
        {
            x=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                x++;
            }
            if(x==2)
            {
                a[c]=i;
                c++;
            }
            i++;
        }
        for(i=0;i<30;i++)
        System.out.println(a[i]+" ");
    }
}