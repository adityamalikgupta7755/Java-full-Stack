class StackframeAllocation
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
        System.out.println(j);
        System.out.println("m1 end");

    }
}