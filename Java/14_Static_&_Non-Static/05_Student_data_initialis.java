class Student
{
    String name;
    long phoneNum;
     
    void initialisaton(String n, long p)
    {
        name =n;
        phoneNum= p;
    }
    void display()
    {
        System.out.println("Name ="+name+"  Phone Number = "+phoneNum);
    }
}
class Test5
{
    public static void main(String[] args)
    {
        Student s1 =new Student();
        s1.initialisaton("aditya", 7852123);
        s1.display();

        Student s2 =new Student();
        s2.initialisaton("malik", 58123);
        s2.display();
    }
}