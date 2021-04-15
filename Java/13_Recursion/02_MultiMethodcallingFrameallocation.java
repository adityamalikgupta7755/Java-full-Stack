class StackframeAllocation1
{
    public static void main(String[] args)
    {
        System.out.println("main start");
        int i=1;
        m1();
        System.out.println(i);
        System.out.println("main end");
    }
    static void m1()
    {
        System.out.println("m1 start");
        int j = 2;
        m2();
        System.out.println(j);
        System.out.println("m1 end");

    }
    static void m2()
    {
        System.out.println("m2 start");
        int k = 2;
        System.out.println(k);
        System.out.println("m2 end");

    }
}