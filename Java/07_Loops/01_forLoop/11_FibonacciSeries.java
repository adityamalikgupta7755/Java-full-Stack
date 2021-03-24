import java.util.Scanner;
class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter a no ");
        int n =scn.nextInt();
        int a=0, b=1, c, i;
        for(i=1; i<=n;i++)
        {
            System.out.print(a+",");
            c=a+b;
            a=b;
            b=c;
        }
    }
}