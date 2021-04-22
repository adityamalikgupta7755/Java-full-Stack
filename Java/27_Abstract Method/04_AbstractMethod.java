abstract class H 
{
    H(){
        System.out.println("Constructor H");
    }
}
class I extends H 
{
    I(){
        System.out.println("Constructor I");
    }
}
class Test2
{
    public static void main(String[] args)
    {
        new I();
    }
}