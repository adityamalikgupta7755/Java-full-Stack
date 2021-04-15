import java.util.Scanner;
class SumDouble
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the digit");
        String s1= scn.next();
        String s2= scn.next();
        double a=Double.parseDouble(s1);
        double b=Double.parseDouble(s2);
        System.out.println(a+b);
        
        // if give digit then it's convert it into string
        // we convert string to integer and then add 
        // parseInt accecpt only digit with integer value
    }
}