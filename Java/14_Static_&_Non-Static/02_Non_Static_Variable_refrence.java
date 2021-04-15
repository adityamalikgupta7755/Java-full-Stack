class B 
{
    int i;
    static void m1()
    {
        // System.out.println(i); // can't call non-static variable in static block without refrenceuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu
    }
    void m2()
    {
        System.out.println(i);
    }
}
class Test1
{
    public static void main(String[] args)
    {
    //   B.i = 10; // compile time error because of non-static variable can't call with class name
    // it should be call by creating obkject
        B b1=new B();
        b1.i=20;
        b1.m1();
        b1.m2(); // 20
        B b2=new B();
        b2.i=50;
        b2.m1();
        b2.m2();// 50
    }
}