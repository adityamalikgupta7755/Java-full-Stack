class Emp
{
    String name;
    int id;
    double sal;

    Emp(String n, int i , double s)
    {
        name=n;
        id = i;
        sal = s;
    }
     Emp(Emp e)
    {
         name=e.name;
        id = e.id;
        sal = e.sal;
    }
    void display()
    {
        System.out.println("Name = "+name);
        System.out.println("id = "+id);
        System.out.println("Salary = "+sal);
    }
}
class Test7
{
    public static void main(String[] args)
    {
        Emp e1 = new Emp("Aditya", 1021, 50000);
        System.out.println(e1);
        e1.display();
        Emp e2 = new Emp(e1);
        System.out.println(e2);
        e2.display();
    }
}