class R 
{
    static void m1()
    {
        System.out.println("m1() R class");
    }
}
class S extends R 
{
    void m1()
    {
        System.out.println("m1() S class");
    }
}
//error: m1() in S cannot override m1() in R
//overridden method is static
// vice-versa is also not possible