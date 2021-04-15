class Car
{
    int regNum;
    String color;
    static int num;

    {
        regNum = ++num;
    }

    Car()
    {
        color = "White";
    }

    Car(String c)
    {
        color = c;
    }
    void display()
    {
        System.out.println("Registration No "+regNum+" Color "+color);
    }
}
class Test1
{
    public static void main(String[] args)
    {
        Car c1 = new Car();
        c1.display();

        Car c2 = new Car("Red");
        c2.display();
    }
}