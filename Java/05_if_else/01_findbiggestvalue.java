import java.util.Scanner;
class greaterVale
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter 2 no");
        int a = scn.nextInt();
        int b = scn.nextInt();

        if(a>b)
        {
            System.out.println("a is greater");
        }
        else if (b>a)
        {
            System.out.println("b is greater");
        }
        else
        {
            System.out.println("both are equal");
        }
    }
}