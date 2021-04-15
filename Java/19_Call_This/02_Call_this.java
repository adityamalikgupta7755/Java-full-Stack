class Books
{
    String title;
    String author;
    
    Books(String t)
    {
        title = t;
    }

    Books(String t, String a)
    {
        new Books(t); // here when we call new instance the current object title blank
        author = a;
    }
    void display()
    {
        System.out.println("Title ="+title);
        System.out.println("Author ="+author);
    }
}
class Test1
{
  public static void main(String[] args)
  {
      Books b1 = new Books("java", "james");
      b1.display();
  }  
}