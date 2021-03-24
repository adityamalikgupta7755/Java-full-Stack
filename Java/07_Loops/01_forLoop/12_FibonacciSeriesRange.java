import java.util.Scanner;
class FibonacciSeriseRange
{
    public static void main(String[] args)
    {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter a no ");
        int n = scn.nextInt();
        int m = scn.nextInt();
        int a=0, b=1, c, i;
        for( ; a<=n; )
        { 
            if(a>=m){
            System.out.print(a+",");
            }
            c=a+b;
            a=b;
            b=c;
        }
    }
}