abstract class E 
{
    abstract void m1();
    void m2()
    {
        System.out.println(" m2 in E");
    }
}
class F extends E 
{
    void m1()
    {
        System.out.println(" m1 in F");
    }
}
class G extends E 
{
    void m1()
    {
        System.out.println(" m1 in G");
    }
    void m2()
    {
        System.out.println(" m2 in G");
    }
}
class Test
{
    public static void main(String[] args)
    {
        E e1 = new F();
        e1.m1();
        e1.m2();
        e1 = new G();
        e1.m1();
        e1.m2();
    }
}