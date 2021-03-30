import java.util.Scanner;
class FibonacciWithRangeInReverse

{
    public static void main(String[] args)
    {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter a n value of fibonacci serise");
        int last =scn.nextInt();
        System.out.println("Enter a n-1 value of fibonacci serise");
        int secondlast =scn.nextInt();
        int c;
        while(secondlast>=0)
        {
            System.out.print(last+",");
            if(last==0) break;
            c=last-secondlast;
            last=secondlast;
            secondlast=c;
        }
    }
}