class N 
{
    static void m1()
    {
        System.out.println("m1() N class" );
    }
}
class O extends N 
{
   
}
class Test4
{
    public static void main(String[] args)
    {
        O.m1();

        // here static m1() is not inherited in sub-class 
        // but we have option using sub-class we can call 
        // super-class static m1()
    }
}