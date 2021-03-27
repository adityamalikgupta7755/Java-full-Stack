class I
{
    public static void main(String[] args)
    {
        a:for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=5; j++)
            {
                System.out.println(i+","+j);
                if(j==3) break a;
            }

        }
    }
}