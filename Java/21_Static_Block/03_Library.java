import java.util.Scanner;
class Book
{
    String title;
    String author;
    double price;

    Book(String t, String a, double p)
    {
        title = t;
        author = a;
        price = p;
    }
    void display()
    {
        System.out.println("Title --> "+title);
        System.out.println("Author --> "+author);
        System.out.println("Price --> "+price);
    }
}
class BookCreate // factory class
{
    static Book creat()
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Title");
        String t = scn.nextLine();
        System.out.println("Enter Author");
        String a = scn.nextLine();
        System.out.println("Enter Price");
        double p = scn.nextInt();

        return new Book(t, a, p);
    }
}
class App 
{
    public static void main(String[] args)
    {
        Book b1 = BookCreate.creat();
        Book b2 = BookCreate.creat();

        b1.display();
        b2.display();
    }
}