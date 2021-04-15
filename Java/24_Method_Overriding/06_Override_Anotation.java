class Animal
{
    void move()
    {
        System.out.println("runnning impl");
    }
}
class Snaks extends Animal
{
    @Override
    void move()
    {
        System.out.println("Crowling impl");
    }
}
class Test3
{
    public static void main(String[] args)
    {
        new Snaks().move();
    }
}