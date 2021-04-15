class defaultconstruc
{

}
class ParameterisedCunstr
{
    ParameterisedCunstr(int i)
    {
        System.out.println("Parameterised constructor");
    }
}
class Test2
{
    public static void main(String[] args)
    {
        new defaultconstruc();
        new ParameterisedCunstr();// compile time error 
        // because when constuctor is written emplicitly by programmer 
        // then java compiler is not going to add default consturctor
    }
}