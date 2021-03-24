class H{
    int i;
    double j;
    public static void main(String[] args)
    {
        H h1 =new H();
        h1.i=10;
        h1.j=20;
        H h2 =new H();
        h2.i=30;
        h2.j=40;

        System.out.println(h1.i);
        System.out.println(h1.j);
        System.out.println(h2.i);
        System.out.println(h2.j);

    }
}