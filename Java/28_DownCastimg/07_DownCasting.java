class Car 
{}
class Audi extends Car 
{}
class Driver {
    void drive(Car c)
    {
        System.out.println("drive(car) of Driver class");
    }
    void drive(Audi a)
    {
        System.out.println("drive(Audi) of Driver class");
    }
}
class PrivateDriver extends Driver 
{
    void drive(Car c)
    {
        System.out.println("drive(car) of PrivateDriver class");
    }
    void drive(Audi a)
    {
        System.out.println("drive(Audi) of PrivateDriver class");
    }
}
class Test5
{
    public static void main(String [] arg)
    {
        Driver d = new Driver();
        Car c = new Car();
        d.drive(c);
    } 
}