class I 
{
    void m1()
    {
        System.out.println("m1() I class");
    }
}
class J extends I 
{
    void m1()
    {
        System.out.println("m1() J class");
    }
}
class K extends J 
{
   
}
class Test2
{
    public static void main(String[] args)
    {
        new K().m1();
    }
}