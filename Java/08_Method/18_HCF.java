import java.util.Scanner;
class HCF
{
    public static void main(String... args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the 2 no for HCF");
        int f = scn.nextInt();
        int s = scn.nextInt();
        int re = hcf(f, s);
        System.out.println("HCF "+re);
    }
    static int hcf(int f, int s)
    {
        int c=(f>s)?f:s;
        int res=0;
        while(true)
        {
            if(f%c==0 && s%c==0){
                res = c;
                break;
            }
            c--;
        }
        return res;
    }
} 