import java.util.*;
public class ddacolmax
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
        for(int j=0;j<5;j++)
        {
            m=a[0][j];
            for(int i=0;i<4;i++)
            {
                if(m<a[i][j])
                m=a[i][j];
            }
            System.out.println("Max of col "+(j+1)+":"+m);
        }
    }
}