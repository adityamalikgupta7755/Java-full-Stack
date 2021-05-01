class Animals
{
}
class Dog extends Animals
{
}
class Zoo 
{
    void m1(Animals a)
    {
        System.out.println("m1 (Animals)");
    }
    void m1(Dog d)
     {
        System.out.println("m1 (Dog)");
    }

}
class Test6 
{
    void m1(Object arg)
    {
        System.out.println("Object Test6");
    }
    void m1(String arg)
    {
        System.out.println("String Test6");
    }
    public static void main(String[] arg)
    {
        Zoo z = new Zoo();
        z.m1(null);
        Animals a = new Dog();
        z.m1(a);
        Dog d = new Dog();
        z.m1(d);
        Animals d1 = new Animals();
        z.m1(d1);


        Test6 t = new Test6();
        t.m1(null);
        t.m1("abc");
        t.m1(new Dog());
    }
}