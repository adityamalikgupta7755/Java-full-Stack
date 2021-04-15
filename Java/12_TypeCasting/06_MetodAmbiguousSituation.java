class AbiguouseSituation
{
    public static void main(String[] args)
    {
        m1(1,2.5);
        m1(1.5,2);
        m1(1,2);
    }
    static void m1(int a, double b)
    {
        //code;
    }
    static void m1(double a, int b)
    {
        //code;
    }
}