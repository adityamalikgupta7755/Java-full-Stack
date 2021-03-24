class C
{
    //initialsed_static_variable
    static int i=10;
    public static void main(String[] args)
    {
        System.out.println(C.i);
        C.i=20;
        System.out.println(C.i);

    }
}