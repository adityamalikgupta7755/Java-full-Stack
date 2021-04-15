class Method_OverLoading
{
    public static void main(String[] args)
    {
        m1(3.5);
        m1();
        m1(2);
    }
    static void m1()
    {
        System.out.println("m1()");
    }
    static void m1(int a)
    {
        System.out.println("m1(int)");
    }
    static void m1( double d)
    {
        System.out.println("m1(double)");
    }
}