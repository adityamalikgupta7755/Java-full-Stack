class C 
{
    C()
    {
        super(); // it is not manditory
        System.out.println("Excuting C constructor");
    }

}
class D extends C 
{
    D()
    {
        super(); // it is not manditory
        System.out.println("Excuting D constructor");
    }

}
class E extends D 
{
    E()
    {
        super(); // it is not manditory
        System.out.println("Excuting E constructor");
    }

}
class Test1
{
    public static void main(String[] args)
    {
        new E();
        System.out.println("-------------");
        new D();
    }
}