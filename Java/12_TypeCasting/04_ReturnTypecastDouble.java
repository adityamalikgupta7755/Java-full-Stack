class ReturnTypecast
{
    public static void main(String[] args)
    {
        System.out.println(m1());
        int i= 5;
        m2(i);
    }
    static double m1()
    {
        return 10; // here by default double is used lower value higher 
    }

    static void m2(double d)
    {
        System.out.println("d = "+d);
    }
}