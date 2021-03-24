class D
{
    public static void main(String[] args)
    {
        System.out.println("main start here");
        m2(); //calling  m1()
        System.out.println("min ends here");
    }
    public static void m1()
    {
        System.out.println("start m1 here");
        System.out.println("end m1 here");
    }
    public static void m2()
    {
        System.out.println("start m2 here");
        m1(); //calling  m1()
        System.out.println("end m2 here");
    }
}