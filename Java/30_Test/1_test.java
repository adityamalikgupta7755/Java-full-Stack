class A
{
    A()
    {
        System.out.println("Default Constructor");
    }
    A(int i)
    {
        this();
        System.out.println("Parameterised Constructor");
    }
}
class Test
{
    public static void main(String[] arg)
    {
        A a = new A(5);
    }
}