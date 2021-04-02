class Sum_Command_Line_Argu
{
    public static void main(String[] args)
    {
       
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            System.out.println(a+b);
            // at the time excution with JRE give argument
            // java Sum_Command_Line_Argu 10 20
            // in above line 10 20 is argument 
            // command line argument take only string 
            // if give digit then it's convert it into string
            // we convert string to integer and then add 
            // parseInt accecpt only digit with integer value
    }
}