class Student
{
   String name;
   int id;
   static int count;
    Student(String n)
    {
        name = n;
        id = ++count;
    }

    void display()
    {
        System.out.println("Name = "+name);
        System.out.println("id = "+id);
    }
}
class Test4
{
    public static void main(String[] args)
    {
        Student s1 = new Student("Aditya");
        s1.display();
        System.out.println(s1.count);

    }
}