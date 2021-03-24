import java.util.Scanner;
class NoOfDays
{
    public static void main(String[] args)
    {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter no of Days");
        int n = scn.nextInt();

        switch(n){
            case 1: System.out.println("Sunday");
                    break;
            case 2: System.out.println("Monday");
                    break;
            case 3: System.out.println("Tuesday");
                    break;
            case 4: System.out.println("Wednessday");
                    break;
            case 5: System.out.println("Thursday");
                    break;
            case 6: System.out.println("Friday");
                    break;
            case 7: System.out.println("Satday");
                    break;
            default : System.out.println("Invalid input");
                    break;
        }
    }
}