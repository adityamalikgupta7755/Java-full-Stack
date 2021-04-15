class C
{
    int i;
    C(int i)
    {
        this.i=i;
    }
   void m1(A a)
    {
        System.out.println(i);
        System.out.println(a.i);
    }
}
class Test3
{
    public static void main(String[] args)
    {
        C c1 = new C(5);
        A a1 = new A(50);
        c1.m1(a1);
    }
}