class A 
{
    public static void main(String[] args)
    {
        final int i =10;
        System.out.println("i ="+i);
        int j =i*2;
        System.out.println("j ="+j);
        System.out.println("i ="+i);
        // i=20;    // compile error because i value can't change
        // ++i;    // compile error because i value can't change
        // i+=2;  // compile error because i value can't change
    }
}