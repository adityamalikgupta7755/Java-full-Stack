class A 
{
    int i;

    void display()
    {
        int i =1;
        System.out.println(i);
        System.out.println(this.i);
        // here we hava local variable same name as non-static
        // so to refrence to non-static variable we use "this" Keyword 
    }
}
class Test
{
    public static void main(String[] args)
    {
        A a1 = new A();
        a1.i=10;
        a1.display();

        A a2 = new A();
        a2.i=15;
        a2.display();
    }
}