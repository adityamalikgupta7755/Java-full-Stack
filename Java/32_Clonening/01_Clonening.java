class A 
{
    protected void m1()
    {
        System.out.println("class A im m1()");
    }
}

class B extends A 
{
    public void m1()
    {
        super.m1();
    }   
}

class Test 
{
    public static void main(String[] arg)
    {
        B b = new B();
        b.m1();
    }
}