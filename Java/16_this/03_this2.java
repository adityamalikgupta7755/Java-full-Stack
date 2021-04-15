class RefrencAddress
{
    void m1()
    {
      System.out.println("m1 Start");
      System.out.println(this);  
    }
}
class Test2
{
    public static void main(String[] args)
    {
        RefrencAddress r1 = new RefrencAddress();
        System.out.println(r1);
        r1.m1();
    }
}