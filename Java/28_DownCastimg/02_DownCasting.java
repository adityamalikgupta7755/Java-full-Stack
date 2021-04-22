class C 
{ }
class D extends C 
{ }
class E extends C 
{ }

class Test1
{
    public static void main(String[] args)
    {
        D d1 = new E();
        F f1 = (F) d1;
        //incompatible types: E cannot be converted to D
        E e1 = (E) d1;
    }
}