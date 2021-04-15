import java.util.Scanner;
class FibnoccNum
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the position of fibnocci");
        int n= scn.nextInt();
        System.out.println( fibnocc(n));

    }
    static int fibnocc(int n)
    {
        int a=0,b=1,c;
        for(int i=1; true; i++){
            if(i==n) return a;
            c=a+b;
            a=b;
            b=c;
        }
    }
}