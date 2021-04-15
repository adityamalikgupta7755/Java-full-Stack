class Parameterised
{
    Parameterised(int i)
    {
        System.out.println("Parameterised Cunstructor");
        System.out.println(i);
    }
}
class Test1
{
    public static void main(String[] args)
    {
        new Parameterised(5);
        new Parameterised(15);
    }
}