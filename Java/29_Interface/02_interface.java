interface I1 
{
    void m1();
}
interface I2 
{
    void m2();
}
class A implements I1,I2
{
    public void m1(){
        System.out.println("m1() in A");
    }
    public void m2(){
        System.out.println("m2() in A");
    }
}
class Test 
{
    public static void main(String [] arg)
    {
        A a1 = new A();
        a1.m1();
        a1.m2();
        I1 i1 = new A();
        i1.m1();
        // i1.m2(); // error 
        I2 i2 = new A();
        // i2.m1(); //error
        i2.m2();

    }
}