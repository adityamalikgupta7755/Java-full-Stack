import java.util.Scanner;
class readLine
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter string");
        String str = scn.nextLine();
        System.out.println(str);
    }
}