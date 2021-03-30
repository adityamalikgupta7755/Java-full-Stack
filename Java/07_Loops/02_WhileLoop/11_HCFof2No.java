import java.util.Scanner;
class HCFof2No
{
    public static void main(String[]args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter First No");
        int first =scn.nextInt();
        System.out.println("Enter Second  No");
        int second =scn.nextInt();
        
        int c = (first>second)?first:second;
        
        while(c>0)
        {
            if(first%c==0 && second%c==0)
                break;
                c--;
        }
         System.out.println(c);
    }

} 