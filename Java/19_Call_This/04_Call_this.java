class Box
{
    int height;
    int width;
    int depth;

    Box()
    { }

    Box(int h, int w, int d)
    {
        height = h;
        width = w;
        depth = d;
    }

    Box(int n)
    {
        this(n, n, n);
    }

    void display()
    {
        System.out.println(height+","+width+","+depth);
    }
}
class Test3
{
    public static void main(String[] args)
    {
        Box b1 = new Box(2,4,5);
        b1.display();

        Box b2 = new Box(5);
        b2.display();
    }
}
