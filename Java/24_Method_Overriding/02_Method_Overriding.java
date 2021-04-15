class C
{
    void m1()
    {
        System.out.println("m1() C class");
    }
}
class D extends C
{
    void m1(int i) //it is not overriding
    {
        System.out.println("m1() D class");
    }
}
class Test1
{
    public static void main(String[] args)
    {
        new D().m1();
        new D().m1(5);
    }
}