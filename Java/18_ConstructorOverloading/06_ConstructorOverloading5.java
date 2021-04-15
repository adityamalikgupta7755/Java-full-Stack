class Bike 
{
    String color;
    Bike(String c)
    {
        color=c;
    }
    void display(Bike b)
    {
        System.out.println(color);
        System.out.println(b.color);
    }
}
class Test5
{
    public static void main(String[] args)
    {
        Bike b1 = new Bike("Red");
        Bike b2 = new Bike("Green");
        b1.display(b2);
        b2.display(b1);
    }
}