class A 
{
    void m1()
    {
        System.out.println("m1 class A");
    }
}
class B extends A 
{
    void m2()
    {
        System.out.println("m1 class B");
    }
}
class C extends A 
{
    void m3()
    {
        System.out.println("m1 class C");
    }
}
class Test
{
    public static  void main(String[] args)
    {
        A a1 = new A();
        a1.m1();
        a1 = (A) new B();
        a1.m1();
        a1 = new C();
        a1.m1();
    }
}