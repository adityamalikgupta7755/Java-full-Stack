class J 
{
    static{
        System.out.println("Static block of J");
    }
}
class K extends J 
{
    static{
        System.out.println("Static block of K");
    }
}
class Test5
{
    public static void main(String[] args)
    {
        System.out.println("main Starts");
        new K();
    }
}