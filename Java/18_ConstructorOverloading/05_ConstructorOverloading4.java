class Car 
{
    String color;
}
class Test4
{
    static void m1(Car c)
    {
        c.color= "black";
        System.out.println("m1() Excuted");
    }
    public static void main(String[] args)
    {
        Car c1 = new Car();
        c1.color="red";
        System.out.println(c1.color);
        m1(c1);
        System.out.println(c1.color);
    }
}