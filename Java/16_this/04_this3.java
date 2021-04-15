class RefrencMethod
{
    int i;
    int j;
    void m1()
    {
        System.out.println("m1() Start");
        System.out.println(i);
    }
    void m2()
    {
        this.m1();
        System.out.println("m2() Start");
        System.out.println(j);
    }
}
class Test3
{
    public static void main(String[] args)
    {
        RefrencMethod r1 = new RefrencMethod();
        r1.i=10;
        r1.j=20;
        r1.m2();

    }
}