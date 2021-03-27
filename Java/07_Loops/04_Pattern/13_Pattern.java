import java.util.Scanner;
class M
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
               if(j==1){
                   System.out.print("*");
               }
               else
               {
                   System.out.print(" ");
               }
               
           }
           for(int j=2; j<=i; j++)
           {
               if(j==i){
                   System.out.print("*");
               }
               else
               {
                   System.out.print(" ");
               }
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
              if(j==1){
                   System.out.print("*");
               }
               else
               {
                   System.out.print(" ");
               }
                
           }
           for(int j=1; j<=(n-1)-i; j++)
           {
               if(j==(n-1)-i){
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
