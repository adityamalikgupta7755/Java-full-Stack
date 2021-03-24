import java.util.Scanner;
class Range
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a no");
        int a= scn.nextInt();
        
        if(a>=1 && a<=10)
        {
            System.out.println("Yes:-"+a+"exist between 1 to 10");   
        }
        else
        {
            System.out.println("No:-"+a+"is not exist between 1 to 10");   
        }

    }
}