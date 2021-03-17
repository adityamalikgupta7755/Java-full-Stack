class D{
    public static void main(String[] args)
    {
        // pre increment
        System.out.println("pre increment");
        int a=1;
        int b = ++a +2;
        System.out.println(a);
        System.out.println(b);
        // pre decrement
        System.out.println("pre decrement");
        int c=1;
        int d = --c +2;
        System.out.println(c);
        System.out.println(d);
        
         // post increment
         System.out.println("post increment");
        int e=1;
        int f = e++ +2;
        System.out.println(e);
        System.out.println(f);
        // post decrement
        System.out.println("post decrement");
        int g=1;
        int h = g-- +2;
        System.out.println(g);
        System.out.println(h);
    }
}