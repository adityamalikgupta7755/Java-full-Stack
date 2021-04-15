class Account
{
    double balance;
}
class Test1
{
    public static void main(String[] args)
    {
        Account a1; // Declearing a1 as a class Type variable
         
        a1 = new Account(); // creating an instance with "new" Keyword with class name

        a1.balance=2000; // passing the value in object datamember balance
        System.out.println(a1.balance);

        a1 = new Account(); // while again creating an instance with older use variable of same class
        // then it lost old refrence
        System.out.println(a1.balance);
    }
}
class Test2
{
    public static void main(String[] args)
    {
        Account a1; // Declearing a1 as a class Type variable
         
        a1 = new Account(); // creating an instance with "new" Keyword with class name

        a1.balance=3000; // passing the value in object datamember balance
        System.out.println(a1.balance);

        Account a2 =a1; // here we passing the address of  same type of class variable [a1---->a2 ]
        System.out.println(a2.balance); // so a2 also triger or refrence same object
    }
}
class Test3
{
    public static void main(String[] args)
    {
        Account a1; // Declearing a1 as a class Type variable
         
        a1 = new Account(); // creating an instance with "new" Keyword with class name

        a1.balance=4000; // passing the value in object datamember balance
        System.out.println(a1.balance);

        a1 = null; // Abundent Object
        System.out.println(a1.balance);// JRE through an error because pointing null 
        // JRE invok garbage collector to remove abundent Object
       //.NullPointerException: Cannot read field "balance" because "<local1>" is null
    }
}
class Test4
{
    public static void main(String[] args)
    {
        Account a1; // Declearing a1 as a class Type variable
         
        a1 = new Account(); // creating an instance with "new" Keyword with class name

        a1.balance=4500; // passing the value in object datamember balance
        System.out.println(a1.balance);

        System.out.println(new Account().balance=5000);
        // single time use object is also Abundent Object
        // JRE invok garbage collector to remove abundent Object
    }
}