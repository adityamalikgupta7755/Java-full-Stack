class E
{
    public static void main(String[] args)
    {
        for(int i=1; i<=10; i+2) // i+2 give compile time error
        {
            System.out.println(i);
            i=+i;
        }
    }
}