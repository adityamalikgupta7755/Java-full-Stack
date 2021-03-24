import java.util.Scanner;
class FibonacciWithRangeInReverse

{
    public static void main(String[] args)
    {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter a n value of fibonacci serise");
        int n =scn.nextInt();
        System.out.println("Enter a n-1 value of fibonacci serise");
        int m =scn.nextInt();
        int  c, i=1;
        while(n>=0)
        {
            System.out.print(n+",");
            if(m==0) break;
            c=n-m;
            n=m;
            m=c;
            i++;
        }
    }
}