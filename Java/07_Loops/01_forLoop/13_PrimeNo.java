import java.util.Scanner;
class PrimeNo
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n=scn.nextInt();
        if(n<=1){
            System.out.println("no is not prime");
            return;
        }
        boolean flag=true;

        for(int i=2; i<=n/2; i++)
        {
            if(n%i==0){
                flag=false;
                break;
            }
        }
        if(flag){
             System.out.println("no is  prime");
        }
        else{
            System.out.println("no is not prime");
        }
    }
}