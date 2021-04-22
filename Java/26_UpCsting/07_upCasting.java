class Car
{
    void start()
    {}
    void accelerate()
    {}
    void brakes()
    {}
}
class Audi extends Car
{
    void start()
    {
        System.out.println("Audi Start");
    }
    void accelerate()
    {
        System.out.println("Audi accelerate");
    }
    void brakes()
    {
        System.out.println("Audi brakes");
    }
}
class Benz extends Car
{
    void start()
    {
        System.out.println("Benz Start");
    }
    void accelerate()
    {
        System.out.println("Benz accelerate");
    }
    void brakes()
    {
        System.out.println("Benz brakes");
    }
}
class Driver
{
    void drive(Car c)
    {
    c.start();
    c.accelerate();
    c.brakes();
    }
}
class Test6
{
    public static void main(String [] args)
    {
        Driver d1 = new Driver();
        d1.drive(new Audi());
        d1.drive(new Benz());
    }
}