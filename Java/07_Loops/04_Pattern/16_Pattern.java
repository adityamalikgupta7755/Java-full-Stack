import java.util.Scanner;
class P
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the range:-");
        int n =scn.nextInt();
        int k=1;
        for(int i=1;i<=n; i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(k%2==0)
                {
                    System.out.print(0);
                }
                else{
                    System.out.print(1);
                }
                k++;
            }
            System.out.println();
        }
    }    
}