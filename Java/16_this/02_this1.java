class Student
{
    String name;
    long phoneNum;

    void addStudent(String name, long phoneNum)
    {
        this.name=name;
        this.phoneNum=phoneNum;
        // here argument and datamember{non-static} variable are same
        // to triger non-static variable or refrenc non-static variable
        // we use "this" keyword
    }
    void display()
    {
        System.out.println("Name ="+name);
        System.out.println("Phone Number ="+phoneNum);
    }
}
class Test1
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.addStudent("aditya", 78418);
        s1.display();

        Student s2 = new Student();
        s2.addStudent("harsh", 4878418);
        s2.display();
    }
}