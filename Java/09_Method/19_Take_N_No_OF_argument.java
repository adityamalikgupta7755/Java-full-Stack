class N_No_Of_Argument
{
    public static void main(String[] args)
    {
        m1(1);
        m1(1,2);
        m1(1,2,3,4,5,6);
    }
    static void m1(int... a)
    {
        System.out.println("m1 starts");
    }
}