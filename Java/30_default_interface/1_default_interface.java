interface I 
{
    void m1();
    
    default void m2()
    {
        System.out.println("default method in interface");
    }
}

class A implements I 
{
     public void m1()
    {
        System.out.println("method 1 in class A");
    }
}
class B implements I 
{
     public void m1()
    {
        System.out.println("method 1 in class B");
    }
     public void m2()
    {
        System.out.println("method 2 in class B");
    }
}

class Test
{
    public static void main(String [] args)
    {
        I obj1 = new A();
        obj1.m1();
        obj1.m2();

        I obj2 = new B();
        obj2.m1();
        obj2.m2();
    }
}