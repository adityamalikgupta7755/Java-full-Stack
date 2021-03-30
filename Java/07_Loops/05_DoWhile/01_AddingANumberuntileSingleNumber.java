import java.util.Scanner;
class AddNumberUntilSingleDigit
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter The number");
        int n=scn.nextInt();
        int sum=0;

        do{
            sum=0;
            while(n>0){
                sum+=n%10;
                n/=10;
            }
            n=sum;
        }while(sum>9);
        System.out.println(sum);
    }
}
