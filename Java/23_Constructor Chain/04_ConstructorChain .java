class H
{
    H(int i)
    {
        System.out.println("Excuting int H constructor");
    }

}
class I extends H
{
    I(int i)
    {
        super(i); // it is  manditory
        System.out.println("Excuting int I constructor");
    }

}
class Test3
{
    public static void main(String[] args)
    {
        new I(5);
    }
}