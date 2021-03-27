import java.util.Scanner;
class F 
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the range:-");
        int n =scn.nextInt();
        for(int i=1; i<=n; i++)
        {
          for(int j=1; j<=n; j++)
          {
              if(i==1||i==n||i==j||i+j==n+1)
              {
                  System.out.print("*");
              }
              else
              {
                  System.out.print(" ");
              }
          }  
          System.out.println();
        }
    }
}