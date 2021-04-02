class ReturnINIntMethod2
{
    public static void main(String[] args)
    {
        System.out.println(" main starts");
        System.out.println(m1());
        System.out.println(" main ends");
    }
     static int m1()
    {
        System.out.println(" m1 starts");
        return m2();
    }
    static int m2()
    {
        System.out.println(" m2 starts");
        int a=2, b=3, c=7;
        return a+b*c;
    }
}