import java.util.Scanner;
class K
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
               if(i==n||j==1)
               {
                   System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
           }
           for(int j=2; j<=i; j++)
           {
               if(i==n||j==i)
               {
                   System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
    }
}
