import java.util.Scanner;
class ArmstrongNo
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scn.nextInt();
        int c=n;
        int count=0,m=0,total=0;
        while(n>0){

            n/=10;
            count++;
        }
        n=c;
        while(n>0){

            m=n%10;
            int pro=1;
            for(int i=1;i<=count;i++)
            {
                pro*=m;
            }
            total+=pro;
            n/=10;
        }
        if(total==c)
        {
            System.out.println("Given no is "+c+" Armstrong NO "+total);
        }
        else
        {
            System.out.println("Given no is "+c+"  Not a Armstrong NO "+total);
        }
    }
}

class ArmstrongNum
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scn.nextInt();
        int c=n;
        int count=0,m=0,total=0;
        while(n>0){

            n/=10;
            count++;
        }
        n=c;
        while(n>0){
            m=n%10;
            total+= (int)Math.pow(m, count);
            n/=10;
        }
        if(total==c)
        {
            System.out.println("Given no is "+c+" Armstrong NO "+total);
        }
        else
        {
            System.out.println("Given no is "+c+"  Not a Armstrong NO "+total);
        }
    }
}