import java.util.Scanner;
class ReverseOfNo
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scn.nextInt();
        int m=0;
        while(n>0)
        {
            m=(m*10)+(n%10);
            n/=10;
        }
        System.out.println(m);
    }
}