class Add_N_argument_Input
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
        int sum=0;
        for(int i=0; i<size; i++)
        {
            sum+=a[i];   
        }
        System.out.println("result ="+sum);
        System.out.println("m1 ends");
    }
}