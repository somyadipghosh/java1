import java.util.*;
public class anagram3
{
    public static void main(String args[])
    {
        int i,l,j,k,m;
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a 3 letter string: ");
        s=sc.nextLine();
        l=s.length();
        for(i=0;i<l;i++)
        {
            for(j=0;j<l;j++)
            {
                for(k=0;k<l;k++)
                {
                    if(i!=j&&j!=k&&i!=k)
                    System.out.print(" "+s.charAt(i)+s.charAt(j)+s.charAt(k));
                }
            }
        }
    }
}