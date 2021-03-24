class D
{
    //initialsed_static_variable
    static int i=10;
    public static void main(String[] args)
    {
        System.out.println("main starts");
        m1();
        D.i=20;
        m1();
        System.out.println("main ends");
    }
    public static void m1()
    {
        System.out.println("m1 starts");
        System.out.println(D.i);
        System.out.println("m1 ends");
    }
}