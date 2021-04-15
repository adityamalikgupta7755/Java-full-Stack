class Sum_DecimalNumber_Command_Line_Argu
{
    public static void main(String[] args)
    {
       
            double a=Double.parseDouble(args[0]);
            double b=Double.parseDouble(args[1]);
            System.out.println(a+b);
            // at the time excution with JRE give argument
            // java Sum_Command_Line_Argu 10 20
            // in above line 10 20 is argument 
            // command line argument take only string 
            // if give digit then it's convert it into string
            // we convert string to double and then add 
            // parseInt accecpt only digit with integer and decimal value
    }
}