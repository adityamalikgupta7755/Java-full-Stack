class C
{
    int i = 1;
}
class D extends C
{
    int i = 2;
    void m2()
    {
        System.out.println(i);
        System.out.println(super.i);
    }
}
class Test1
{
    public static void main(String[] args)
   {
       D d1 = new D();
       d1.m2();
   }
}