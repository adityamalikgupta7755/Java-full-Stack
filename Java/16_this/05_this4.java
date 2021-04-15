class RefrencInStaticMethod
{
    int i;
    static void m1()
    {
        this.i=10; // compile time error
        // non-static variable this cannot be referenced from a static context
    }
}