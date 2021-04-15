class F 
{
    F()
    {
        super(); // it is not manditory
        System.out.println("Excuting F constructor");
    }
    F(int i)
    {
        super(); // it is not manditory
        System.out.println("Excuting int F constructor");
    }

}
class G extends F
{
    G()
    {
        super(); // it is not manditory
        System.out.println("Excuting G constructor");
    }
    G(int i)
    {
        super(i); // it is not manditory
        System.out.println("Excuting int G constructor");
    }

}

class Test2
{
    public static void main(String[] args)
    {
        new G();
        System.out.println("-------------");
        new G(5);
    }
}