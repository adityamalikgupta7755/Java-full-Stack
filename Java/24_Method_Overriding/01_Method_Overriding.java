class A 
{
    void m1()
    {
        System.out.println("m1() A class");
    }
}
class B extends A 
{
    void m1()
    {
        System.out.println("m1() B class");
    }
}
class Test
{
    public static void main(String[] args)
    {
        new B().m1();
    }
}