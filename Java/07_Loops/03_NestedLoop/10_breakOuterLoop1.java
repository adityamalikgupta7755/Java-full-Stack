class J
{
    public static void main(String[] args)
    {
        int i=0, j=5;
        a:for( ; ; )
        {
            for( ; ; )
            {
                if(++i > --j) break a;
            }

        }
        System.out.println(i);
        System.out.println(j);
    }
}