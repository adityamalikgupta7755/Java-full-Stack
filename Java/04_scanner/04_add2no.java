import java.util.Scanner;
class add
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter 2 no");
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(a+"+"+b+"="+(a+b));
    }
}