class A 
{
    int i;
    A(int i)
    {
        this.i=i;
    }
}
class B 
{
    static void m1(A a)
    {
        System.out.println(a.i);
    }
}
class Test2
{
    public static void main(String[] args)
    {
        A a1 = new A(5);
        B.m1(a1);
        B.m1(new A(15));
    }
}