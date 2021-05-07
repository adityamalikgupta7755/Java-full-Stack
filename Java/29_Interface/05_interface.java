interface Car 
{
    void start();
    void accelerate();
    void brakes();
    void lights();
}
abstract class AbstractCar
{
    int regNum;
    private static int num=1000;
    
    {
        regNum = num++;
    }

    public void lights()
    {
        System.out.println(regNum+"lightup");
    }
    public void brakes()
    {
        System.out.println(regNum+"brakes");
    }
}

class petrolCar extends AbstractCar implements Car
{
    public void start()
    {
        System.out.println(regNum+"petrol car starts");
    }
     public void accelerate()
    {
        System.out.println(regNum+"petrol car accelerate");
    }
}
class DieselCar extends AbstractCar implements Car
{
    public void start()
    {
        System.out.println(regNum+"Diesel car starts");
    }
     public void accelerate()
    {
        System.out.println(regNum+"Diesel car accelerate");
    }
}

class Test3
{
    public static void main(String[] arg)
    {
        Car c1 = new petrolCar();
        c1.start();
        c1.accelerate();
        c1.brakes();
        c1.lights();
        Car c2 = new DieselCar();
        c2.start();
        c2.accelerate();
        c2.brakes();
        c2.lights();
    }
}