class Sim
{}
class Airtle extends Sim
{}
class Jio extends Sim
{}
class Bsnl extends Sim
{}
class Phone
{
    void insertSim(Sim s)
    {
        System.out.println("Sim insertde");
    }
}
class Test2
{
    public static void main(String[] arg)
    {
        Phone p1 = new Phone();
        p1.insertSim(new Airtle());
        p1.insertSim(new Jio());
        p1.insertSim(new Bsnl());
    }
}