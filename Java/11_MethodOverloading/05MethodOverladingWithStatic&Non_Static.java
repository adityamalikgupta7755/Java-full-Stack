class MethodWithStaticAndNon_Static
{
    public static void main(String[] args)
    {
        MethodWithStaticAndNon_Static.m1();
        MethodWithStaticAndNon_Static b=new MethodWithStaticAndNon_Static();
        b.m1(2);
    }
    static void m1()
    {
        System.out.println(" Static m1()");
    }
    void m1(int i)
    {
        System.out.println(" Non-Static m1()");
    }
}