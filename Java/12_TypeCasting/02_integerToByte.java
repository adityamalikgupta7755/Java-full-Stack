class IntToByte
{
    public static void main(String[] args)
    {
        int i =5;
        byte b= (byte)i; 
        System.out.println("b-->"+b);

        int a =132;
        byte d= (byte)a; // lose of data
        System.out.println("d-->"+d);
    }
}