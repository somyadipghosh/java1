import java.util.*;
public class constructor_run
{
    int pan;
    String name;
    double taxincome,tax;
    public constructor_run()//default constructor
    {
        pan=1001;
        name="Computer";
        taxincome=45000;
        tax=500;
    }
    public constructor_run(int pan,String n, double ti,double t)//parameterised constructor
{
this.pan=pan;
name=n;
taxincome=ti;
tax=t;
}
public constructor_run(int p,String n, double ti)//parameterised constructor
{
pan=p;
name=n;
taxincome=ti;
tax=450;
}
public constructor_run(constructor_run ob)//copy constructor
{
    pan=ob.pan;
    name=ob.name;
    taxincome=ob.taxincome;
    tax=ob.tax;
}
public void input()
{
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Pan: ");
    pan=sc.nextInt();
    System.out.print("Enter Name: ");
    name=sc.nextLine();
    System.out.print("Enter taxable Income: ");
    taxincome=sc.nextDouble();
}
public void cal()
{
    if(taxincome<=250000)
    tax=0;
    else if(taxincome>250000 && taxincome<=500000)
    tax=(taxincome-250000)*0.10;
    else if(taxincome>500000 && taxincome<=1000000)
    tax=30000+(taxincome-500000)*0.20;
    else
    tax=50000+(taxincome-1000000)*0.30;
}
public void display()
{
    System.out.println("PAN\tName\tTaxincome\tTax");
    System.out.println(this.pan+"\t"+this.name+"\t"+this.taxincome+"\t"+this.tax);
}
} 
class run
{
    public static void main(String args[])
    {
        constructor_run ob=new constructor_run();//object creation
        ob.display();
        constructor_run ob1=new constructor_run(1111,"Science",40000,250);
        ob1.display();
        constructor_run ob2=new constructor_run(1200,"java",55000);
        ob2.display();
        constructor_run ob3=new constructor_run(ob);
        ob3.display();
        /*ob.input();
         * ob.cal();
         * ob.display();*/
        }
    }         