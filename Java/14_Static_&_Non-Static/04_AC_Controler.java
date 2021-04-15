class Ac
{
    int temp;
    void setDefaultTempr()
    {
        temp=23;
    }
    void increaseTempr()
    {
        ++temp;
    }
     void decreaseTempr()
    {
        --temp;
    }
    void displayTempr()
    {
        System.out.println("Current Temprature"+temp);
    }
}
class Test4
{
    public static void main(String[] args)
    {
        Ac ac1 = new Ac();
        ac1.displayTempr();
        ac1.setDefaultTempr();
        ac1.displayTempr();
        ac1.increaseTempr();
        ac1.displayTempr();
        ac1.decreaseTempr();
        ac1.displayTempr();
    }
}