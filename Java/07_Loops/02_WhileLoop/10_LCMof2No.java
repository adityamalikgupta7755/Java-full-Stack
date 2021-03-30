import java.util.Scanner;
class LCMof2No
{
    public static void main(String[]args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter First No");
        int first =scn.nextInt();
        System.out.println("Enter Second  No");
        int second =scn.nextInt();
        int c;
        if(first>second){
            c=first;
        }
        else{
            c=second;
        }
        while(c>0)
        {
            if (c % first == 0 && c % second == 0)
            {
                System.out.println("The LCM of and is"+first+","+second+"="+c);
                break;
            }
            ++c;
        }
    }
} 