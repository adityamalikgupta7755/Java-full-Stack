import java.util.Scanner;
class Vegetable
{}
class Carrot extends Vegetable
{
    void PrepareHalwa()
    {
       System.out.println("halwa Prepared"); 
    }
}
class Potato extends Vegetable
{
     void PrepareFries()
    {
       System.out.println("Fries Prepared"); 
    }
}
class VegShop
{
    Vegetable sell(String vegName)
    {
        if(vegName.equals("Potato")) return new Potato();
        if(vegName.equals("Carrot")) return new Carrot();

        System.out.println(vegName+"-Not avilable");
        return null;
    }
}

class Test4
{
    public static void main(String[] arg)
    {
        Scanner scn = new Scanner(System.in);
        VegShop vegshop1 = new VegShop();
        System.out.println("Enter Veg Name");
        String vegName = scn.next();

        Vegetable v = vegshop1.sell(vegName);

        if(v instanceof Potato)
        ((Potato)v).PrepareFries();

        if(v instanceof Carrot)
        ((Carrot)v).PrepareHalwa();
    }
}