import java.util.Scanner;
class PrimeNoRange
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Starting No");
        int a=scn.nextInt();
        System.out.println("Enter the ending No");
        int b=scn.nextInt();
        for(int i=a; i<=b; i++)
        {
            if(i==1) continue;
            boolean flag=true;
            for(int j=2; j<=i/2; j++)
            {
                if(i%j==0){
                    flag=false;
                    break;
                }
            }if(flag)System.out.println(i);
        }
    }
}