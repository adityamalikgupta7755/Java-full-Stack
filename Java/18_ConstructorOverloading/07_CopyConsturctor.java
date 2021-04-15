class Rectangle
{
    int length;
    int width;

    Rectangle(int l, int w)
    {
        length = l;
        width = w;
    }
     Rectangle(Rectangle r)
    {
        length = r.length;
        width = r.width;
    }
    void display()
    {
        System.out.println("Length = "+length);
        System.out.println("Width = "+width);
    }
}
class Test6
{
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle(10,25);
        System.out.println(r1);
        r1.display();
        Rectangle r2 = new Rectangle(r1);
        System.out.println(r2);
        r2.display();
    }
}