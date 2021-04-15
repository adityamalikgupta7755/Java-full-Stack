import java.util.Scanner;
class LeapYear
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Year");
        int n = scn.nextInt();
        if(leapyear(n)) 
        System.out.println("LeapYear");
        else
        System.out.println("Not LeapYear");
    }
    static boolean leapyear(int n)
    {
        if((n%400==0)||(n%4==0 && n%100!=0)) return true;

        return false;
    }
}