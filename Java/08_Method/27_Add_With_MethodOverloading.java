class Add_with_Method_OverLoading
{
    public static void main(String[] args)
    {
        int res1 = add(10, 15);
        System.out.println("int add call"+res1);
        double res2 = add(1.0, 1.5);
        System.out.println("double add call"+res2);
        double res3 = add(10, 1.5);
        System.out.println("mix add call"+res3);
    }
    static int add(int a, int b)
    {
        return a+b;
    }
    static double add(int a, double b)
    {
        return a+b;
    }
    static double add(double a , double b)
    {
        return a+b;
    }
}