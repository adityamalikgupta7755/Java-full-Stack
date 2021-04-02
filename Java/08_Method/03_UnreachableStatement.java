class UnreachableStatement
{
    public static void main(String[] args)
    {
        System.out.print("main starts");
        m1();
        System.out.print("main ends");
    }
    static int m1()
    {
        System.out.print("m1 starts");
        return 14;
        // System.out.print("m1 ends"); // un-reachable statements
    }
}