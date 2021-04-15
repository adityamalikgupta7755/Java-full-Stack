class A
{
    A()
    {
        System.out.println("Default constructor");
    }

    A(int i)
    {
        this();
        System.out.println("int  constructor");
    }
}
class Test
{
    public static void main(String[] args)
    {
        A a1 = new A(5);
    }
}