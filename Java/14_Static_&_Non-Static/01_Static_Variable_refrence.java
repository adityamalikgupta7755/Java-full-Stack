class A
{
    static int i;
    static void m1()
    {
        System.out.println(i);
    }
    void m2()
    {
        System.out.println(i);
    }
}
class Test
{
    public static void main(String[] args)
    {
        A.i=10;
        A a1=new A();
        A a2=new A();

        A.m1();
        // A.m2(); // error: non-static method m2() cannot be referenced from a static context
        a1.m1();
        a1.m2();
        a2.m1();
        a2.m2();
    }
}