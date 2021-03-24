import java.util.Scanner;
class PrimeNo
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n=scn.nextInt();
        int i=2;
        boolean flag=true;
        while(i<=n/2)
        {
            if(n%i==0){
                flag=false;
                break; 
            }
            i++;
        }
        if(flag){
             System.out.println("no is  prime");
        }
        else{
            System.out.println("no is not prime");
        }
    }
}