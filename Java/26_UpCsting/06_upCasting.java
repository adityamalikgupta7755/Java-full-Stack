class M 
{
    static void m1()
    {
        System.out.println("static M m1()");
    }
}
class N extends M 
{
    static void m1()
    {
        System.out.println("static N m1()");
    }
}
class O extends M 
{
    static void m1()
    {
        System.out.println("static O m1()");
    }
}
class Test5
{
    public static void main(String[] args)
    {
        M m1 = new M();
        m1.m1();
        m1 = new N();
        m1.m1();
        m1 = new O();
        m1.m1();
    }
}