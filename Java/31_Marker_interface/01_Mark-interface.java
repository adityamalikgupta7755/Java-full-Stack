class Washer implements Washable
{
    void wash(Object arg)
    {
        if(arg instanceof Washable )
        {
            System.out.println("object is washable");
        }
        else
        {
            System.out.println("object is not washable");
        }
    }
}
interface Washable
{ }

class Car implements Washable
{ 
    //care implements washable
}
class Phone
{ }

class Test
{
    public static void main(String[] arg)
    {
        Car c1 = new Car();
        Phone p1 = new Phone();

        Washer w = new Washer();
        w.wash(c1);
        w.wash(p1);
    }
}
 