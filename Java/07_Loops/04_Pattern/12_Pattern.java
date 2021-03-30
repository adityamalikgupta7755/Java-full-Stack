import java.util.Scanner;
class L_A
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the range:-");
        int n =scn.nextInt();
        n=(n/2)+1;
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
class L_B
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the range:-");
        int n =scn.nextInt();
        int star=1,space=n/2;
       for(int i=1; i<=n; i++)
       {
           for(int j=1;j<=space;j++)
           {
               System.out.print(" ");
           }
           for(int j=1;j<=star;j++)
           {
               System.out.print("*");
           }
            if(n/2>=i)
            {
               star+=2;
               space--;
           }
           else
           {
               star-=2;
               space++;
           }
           System.out.println();
       }
       
    }
}
