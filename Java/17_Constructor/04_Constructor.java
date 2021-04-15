class Rectangle
{
    int length;
    int width;
    Rectangle(int l, int w)
    {
        length = l;
        width = w;
    }

    void display()
    {
        System.out.println("length = "+length);
        System.out.println("width = "+width);
    }
}
class Test3
{
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle(10,25);
        r1.display();

    }
}