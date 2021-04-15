class A 
{
    {
        System.out.println("Non-Static block");
    }
    A(){
        System.out.println("Default constructor");
    }
    A(int i){
        System.out.println("int constructor");
    }
}
class Test
{
    public static void main(String[] args)
    {
        new A();
        new A(5);
    }
}