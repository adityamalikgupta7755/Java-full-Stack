import java.util.Scanner;
class FibonacciWithRange

{
    public static void main(String[] args)
    {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter a range starting and ending");
        int n =scn.nextInt();
        int m =scn.nextInt();
        int a=0, b=1, c, i=1;
        while(a<=m)
        {
            if(a>=n)
            System.out.print(a+",");
            c=a+b;
            a=b;
            b=c;
            i++;
        }
    }
}