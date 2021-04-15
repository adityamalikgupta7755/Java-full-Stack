import java.util.Scanner;
class Factorial
{
    public static void main(String[] args)
    {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter Number for finding Factorial");
        int n = scn.nextInt();
        System.out.println(fact(n));

    }
    static int fact(int n)
    {
        if(n==1||n==0) return 1;

        return n*fact(n-1);
    }
}