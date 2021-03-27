import java.util.Scanner;
class L
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the range:-");
        int n =scn.nextInt();
       for(int i=1; i<=n; i++)
       {
           for(int j=1; j<=n-i; j++)
           {
               System.out.print(" ");
           }
           for(int j=1; j<=i; j++)
           {
               System.out.print("*");
           }
           for(int j=2; j<=i; j++)
           {
               System.out.print("*");
           }
           System.out.println();
       }
       for(int i=1; i<=n; i++)
       {
           for(int j=1; j<=i; j++)
           {
              System.out.print(" "); 
           }
           for(int j=1; j<=n-i; j++)
           {
              System.out.print("*"); 
           }
           for(int j=1; j<=(n-1)-i; j++)
           {
               System.out.print("*");
           }
           System.out.println();
       }
    }
}
