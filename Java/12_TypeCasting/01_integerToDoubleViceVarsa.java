class IntToDouble
{
    public static void main(String[] args)
    {
        int i =5;
        double d = i; // auto widening
        System.out.println("d-->"+d);

        
        double d1 = 5.76; // auto widening
        int i1 =(int) d1;
        System.out.println("i1-->"+i1);
    }
}