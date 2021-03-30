import java.util.Scanner;
class O
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the range:-");
        int n =scn.nextInt();
        int start;
        for(int i=1;i<=n; i++)
        {
            if(i%2!=0){
                start=(i-1)*5+1;
                for(int j=1;j<=n;j++)
                {
                    System.out.print(start+"\t");
                    start++;
                }
            }
            else
            {
                start=i*5;
                for(int j=1;j<=n;j++)
                {
                    System.out.print(start+"\t");
                    start--;
                }
            }
            System.out.println();
        }
    }    
}