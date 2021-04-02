import java.util.Scanner;
class BiggestNum
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 2 Number");
        int a =scn.nextInt();
        int b =scn.nextInt();
        System.out.println(biggest(a,b)+"is biggest Number");
    }
    static int biggest(int a, int b)
    {
        int result = (a>b)?a:b;

        return result;
    }
}