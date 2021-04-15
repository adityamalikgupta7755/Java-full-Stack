import java.util.Scanner;
class SumNthSerise
{
    public static void main(String... args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Nth Serise");
        int n = scn.nextInt();
        System.out.println(sumNthTerm(n));
    }
    static int sumNthTerm(int n)
    {
        int sum=0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
        return sum;
    }

}