class D
{
    void m1()
    {
        System.out.println("m1 class D");
    }
}
class E extends D
{
    void m2()
    {
        System.out.println("m1 class E");
    }
}
class F extends D 
{
    void m3()
    {
        System.out.println("m1 class F");
    }
}
class Test1
{
    public static  void main(String[] args)
    {
        D d1 = new D();
        d1.m1();
        d1 = (D) new E();
        d1.m1();
        // d1.m2(); // compile time error
        d1 = new F();
        d1.m1();
        // d1.m2(); // compile time error 
        // because d1 is super class refrence variable 
        // super class doesn't having a property of sub-class
    }
}