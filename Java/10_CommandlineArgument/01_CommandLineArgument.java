class Command_Line_Argu
{
    public static void main(String[] args)
    {
        for(int i=0; i<args.length; i++)
        {
            System.out.println(args[i]);
            // at the time excution with JRE give argument
            // java Command_Line_Argu  Aditya malik gupta
            // in above line aditya malik gupta is argument
            // command line argument take only string 
            // if give digit then it's convert it into string
        }
    }
}