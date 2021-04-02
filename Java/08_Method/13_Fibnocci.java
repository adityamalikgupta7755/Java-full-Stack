import java.util.Scanner;
class Fibnocc
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
        int a=0,b=1,c,y=0;
        for(int i=1; i<=n; i++){
            y=a;
            c=a+b;
            a=b;
            b=c;
        }
        return y;
    }
}