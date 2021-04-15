class L 
{
    {
        System.out.println("non-static block L");
    }
    L(){
        System.out.println("Constructor L default");
    }
}
class M extends L 
{
    {
        System.out.println("non-static block M");
    }
    M(){
        System.out.println("Constructor M default");
    }
}
class Test6
{
    public static void main(String[] args)
    {
        new M();
    }
}