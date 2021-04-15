import java.util.Scanner;
class R 
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter No of line");
        int n = scn.nextInt();

        for(int i=1; i<=n; i++)
        {
            if(i==1|| i==(n/2)+1||i==n)
            {
                for(int j=1; j<=n-1; j++)
                {
                    if(j<=3)
                    {
                        System.out.print(" ");
                    }
                    else 
                    {
                        System.out.print("*");
                    }
                }
            }
            else
            {
                for(int j=1; j<=n; j++)
                {
                    if(j==3||j==n)
                    {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}