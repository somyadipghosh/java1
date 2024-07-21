//store prime numbers upto 100 in an array.
public class arr_prime100
{
    public static void main(String args[])
    {
        int i=2,j,c=0,x;
        while(i<=100)
        {
            x=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                x++;
            }
            if(x==2)
            {
                c++;
            }
            i++;
        }
        System.out.println("Number of primes "+c);
        int a[]=new int[c];
        int z=0;
        i=0;
        while(i<=100)
        {
            x=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                x++;
            }
            if(x==2)
            {
                a[z]=i;
                z++;
            }
            i++;
        }
        for(i=0;i<c;i++)
        System.out.println(a[i]+" ");
        }
    }