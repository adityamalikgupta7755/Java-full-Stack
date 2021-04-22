abstract class A 
{
    //valid
    void m1()
    { }
}
 class B 
{
    abstract void m1(); // compile time error 
    // when method is abstract then class should be abstract
}
abstract class C
{
    abstract void m1();
    void m2(){ }
}
abstract class D
{
    abstract void m1();
    public static void main(String[] args)
    {
        D d1 ;
        new D; // compile time error 
            // when class is abstract then instance is not created
    }
}