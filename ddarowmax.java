import java.util.*;
public class ddarowmax
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[4][5];
        int m;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++)
            {
            System.out.println("Enter ");
            a[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<4;i++)
    {
        m=a[i][0];
        for(int j=0;j<5;j++)
        {
            if(m<a[i][j])
            m=a[i][j];
        }
        System.out.println("Max of row "+(i+1)+":"+m);
    }
}
}