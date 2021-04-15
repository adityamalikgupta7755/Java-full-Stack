class Person
{
    String name;
    Person(String n)
    {
        name = n;
    }
}
class Teacher extends Person
{
    String sub;
    Teacher(String n,String s)
    {
        super(n);
        sub = s;
    }
    void display()
    {
        System.out.println("Name  "+name+"  Subject  "+sub);
    }
}
class Test4
{
    public static void main(String[] args)
    {
        Teacher t1 = new Teacher("aditya", "coding");
        t1.display();
    }
}