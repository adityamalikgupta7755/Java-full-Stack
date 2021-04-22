class G
{
    void m1()
    {
        System.out.println("m1 class G");
    }
}
class H extends G
{
    void m1()
    {
        System.out.println("m1 class H");
    }
}
class I extends G 
{
    void m1()
    {
        System.out.println("m1 class I");
    }
}
class Test3
{
    public static  void main(String[] args)
    {
        G g1 = new G();
        g1.m1();
        g1 =  new H();
        g1.m1();
        g1 = new I();
        g1.m1();
        
    }
}