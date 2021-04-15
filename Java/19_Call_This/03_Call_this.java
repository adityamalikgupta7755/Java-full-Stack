class Book
{
    String title;
    String author;
    
    Book(String t)
    {
        title = t;
    }

    Book(String t, String a)
    {
        this(t);
        author = a;
    }
    void display()
    {
        System.out.println("Title ="+title);
        System.out.println("Author ="+author);
    }
}
class Test2
{
  public static void main(String[] args)
  {
      Book b1 = new Book("java", "james");
      b1.display();
  }  
}