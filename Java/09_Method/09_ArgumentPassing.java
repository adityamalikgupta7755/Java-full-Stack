class ArgumentPassing1
{
    public static void main(String[] args)
    {
        // m1(); // if we not passing value in argument method its a compile time error
        // m1(5,8); // if actula or real argument we can't give more then formal argument 
        m1(8);
        int i=7;
        m1(i);
        m1(i*6);
    }
    static void m1(int a)
    {
        System.out.println("a ="+a);
    }
}