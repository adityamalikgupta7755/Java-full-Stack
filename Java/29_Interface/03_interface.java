interface I3
{
    void m1();
}
interface I4 extends I3
{
    void m1();
}
class B implements I3,I4
{
    public void m1(){
        System.out.println("m1() in B");
    }
}
class C extends B
{
    public void m1()
    {
        System.out.println("m1() in C");
    }
}
class Test1 
{
    public static void main(String [] arg)
    {
        I3 obj1 = new B();
        obj1.m1();

        I4 obj2 = new B();
        obj2.m1();
        C c = new C ();
        c.m1();
    }
}