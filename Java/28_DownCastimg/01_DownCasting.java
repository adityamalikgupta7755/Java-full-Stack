class A 
{
    void m1()
    {
        System.out.println("m1 in A");
    }
}
class B extends A 
{
    void m2()
    {
        System.out.println("m2 in B");
    }
}
class Test
{
    public static void main(String[] arg)
    {
        A a1 = new B();
        a1.m1();
        // a1.m2();

        B b1 = (B) a1;
        b1.m2();

        ((B)a1).m2();
    }
}