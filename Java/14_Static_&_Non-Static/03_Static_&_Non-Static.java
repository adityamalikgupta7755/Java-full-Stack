class C 
{
    static int i;
    int j;
    void increment()
    {
        ++i;
        ++j;
    }
    void display()
    {
        System.out.println(i+","+j);
    }
}
class Test3
{
    public static void main(String[] args)
    {
        C c1 = new C();
        c1.i=5;
        c1.j=6;
        c1.increment();
        c1.display();
        System.out.println(".................");
        C c2 = new C();
        c2.increment();
        c2.display();
    }
}