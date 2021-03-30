import java.util.Scanner;
class Pallendrome
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scn.nextInt();
        int p=n,m=0;
        while(n>0)
        {
            m=(m*10)+(n%10);
            n/=10;
        }
        if(p==m)
        {
            System.out.println("pallendrome");
        }
        else
        {
            System.out.println("not a pallendrome");
        }
        
    }
}