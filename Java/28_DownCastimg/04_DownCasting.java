class Animal
{ }
class Dog extends Animal 
{ }

class Labrador extends Dog
{ }

class Test2
{
    public static void main(String[] args)
    {
        Animal a1 = new Labrador();
        System.out.println(a1 instanceof Dog);
    }
}