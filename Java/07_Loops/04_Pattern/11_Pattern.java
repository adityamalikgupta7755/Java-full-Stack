import java.util.Scanner;
class K_A
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
class K_B
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the range:-");
        int n =scn.nextInt();
        int star=1;
        int space=n-1;
       for(int i=1; i<=n; i++)
       {
           for(int j=1; j<=space; j++)
           {
               System.out.print(" ");
           }
           for(int j=1; j<=star; j++)
           {
                if(i==n||j==1||j==star)
               {
                   System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
           }
           star+=2;
           space--;
           System.out.println();
       }
    }
}
