import java.util.Scanner;
class EvenOdd
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n =scn.nextInt();
        if(evenOdd(n))
        {
            System.out.println(n+"is even");
        }
        else
        {
            System.out.println(n+"is odd");
        }

    }

    static boolean evenOdd(int a)
    {
        if(a%2==0) return true;

        return false;
    }
}