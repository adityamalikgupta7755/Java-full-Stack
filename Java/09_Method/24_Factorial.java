import java.util.Scanner;
class FactorialOfNum
{
    public static void main(String... args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number for factorial");
        int n = scn.nextInt();
        System.out.println(factorial(n));
    }
    static int factorial(int n)
    {
        int fact=1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        return fact;
    }

}