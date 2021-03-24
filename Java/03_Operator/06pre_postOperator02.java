class F
{
    public static void main(String[] args)
    {
        int i=0;
        int j=0;
        j=i++ + --i + ++i + i--;
        System.out.println(i);
        System.out.println(j);
    }
}