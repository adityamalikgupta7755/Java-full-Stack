class ScopeofVariable
{
    public static void main(String[] args)
    {
        System.out.println("main starts");
        int a=10;// here the scope of variable a is only for main method
        m1(a);
        System.out.println("a = "+a);
        System.out.println("main ends");
    }
    static void m1(int a)
    {
        System.out.println("m1 starts");
        System.out.println("a = "+a);// here the scope of variable a is only for m1() method
        a=50;
        System.out.println("a = "+a);
        System.out.println("m1 ends");
    }
}
