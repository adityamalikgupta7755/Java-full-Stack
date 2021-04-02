class N_No_Of_Argument_print
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
        int size = a.length;
        for(int i=0; i<size; i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.println("m1 ends");
    }
}