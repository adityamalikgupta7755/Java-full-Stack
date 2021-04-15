class A 
{
    static int i;
    static{
         i=5;
        System.out.println("Static Block");
    }
}
class Test 
{
    public static void main(String[] args)
    {
        System.out.println("main start");
        System.out.println(A.i);
        System.out.println(A.i);
    }
}