class Overloading
{
    Overloading()
    {
        System.out.println("Default Constructor");
    }
      Overloading(int i)
    {
        System.out.println("int Constructor");
    }
      Overloading(int a, double b)
    {
        System.out.println("int , double Constructor");
    }
}
class Test
{
    public static void main(String[] args)
    {
        new Overloading();
        new Overloading(2);
        new Overloading(5,2.5);
    }
}