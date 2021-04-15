class L
{
    final void m1()
    {
        System.out.println("m1() L class");
    }
}
class M extends L
{
    void m1() // error: m1() in M cannot override m1() in L
    {
        System.out.println("m1() M class");
    }
    //overridden method is final
}