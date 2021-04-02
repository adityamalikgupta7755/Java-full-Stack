class PrimeNums
{
    public static void main(String[] args)
    {
        for(int i=1; i<=100; i++)
        {
            if(primenums(i))
            System.out.print(i+",");
        }
    }

    static boolean primenums(int i)
    {
        if (i<=1) return false;
        for(int j=2; j<=i/2; j++)
        {
            if(i%j==0) return false;
        }
        return true;
    }
}