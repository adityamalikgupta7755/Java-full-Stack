import java.util.Scanner;
class ReturnINIntMethod3
{
    public static void main(String[] args)
    {
        System.out.println(" main starts");
        int i =m1();
        System.out.println("i = "+i);
        System.out.println(" main ends");
    }
     static int m1()
    {
        System.out.println(" m1 starts");
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a number");
        int n = scn.nextInt();
        // return n++;
        n++;
        return n;
    }
}