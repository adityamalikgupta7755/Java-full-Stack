import java.util.Scanner;
class EvenOdd
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter no");
        int a = scn.nextInt();
        if(a%2==0)
        {
            System.out.println("no is even");
        }
        else
        {
            System.out.println("no is odd");
        }
    }
}