class P
{
    static void m1()
    {
        System.out.println("m1() P class" );
    }
}
class Q extends P 
{
  static void m1()
    {
        System.out.println("m1() Q class" );
    } 
}
class Test5
{
    public static void main(String[] args)
    {
        Q.m1();

        // here static m1() is not override in sub-class 
        // it hidding super-class static m1()
        //by writting static method with same signature in sub-class
    }
}