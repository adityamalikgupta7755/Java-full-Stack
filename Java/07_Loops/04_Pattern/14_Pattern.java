import java.util.Scanner;
class N
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the range:-");
        int n =scn.nextInt();
        int k=1;
        for(int i=1;i<=n; i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(k+"\t");
                k++;
            }
            System.out.println();
        }
    }    
}