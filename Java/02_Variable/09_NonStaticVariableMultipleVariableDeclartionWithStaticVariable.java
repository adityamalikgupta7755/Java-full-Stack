class I 
{
    static int i;
    int j;
    public static void main (String [] args)
    {
        I i1 = new I();
        i1.j=10;
        I i2 = new I();
        i2.j=20;
        System.out.println(i1.j);
        System.out.println(i2.j);

        i1.i =50;
        i2.i=60;
        System.out.println(i1.i);
        System.out.println(i2.i);


    }
}