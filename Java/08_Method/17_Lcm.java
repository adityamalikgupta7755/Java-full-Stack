import java.util.Scanner;
class LCM
{
    public static void main(String... args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the 2 no for LCM");
        int f = scn.nextInt();
        int s = scn.nextInt();
        int re = lcm(f, s);
        System.out.println("LCM "+re);
    }
    static int lcm(int f, int s)
    {
        int c=(f>s)?f:s;
        int res=0;
        while(c>0)
        {
            if(c%f==0 && c%s==0){
                res = c;
                break;
            }
            ++c;
        }
        return res;
    }
}