class Box
{
    int height;
    int width;
    int depth;
    Box()
    {
        
    }
      Box(int h, int w, int d)
    {
        height = h;
        width = w;
        depth = d;
    }
      Box(int n)
    {
        height = n;
        width = n;
        depth = n;
    }
    void display()
    {
        System.out.println("height = "+height);
        System.out.println("Width = "+width);
        System.out.println("Depth = "+depth);
    }
}
class Test1
{
    public static void main(String[] args)
    {
        Box b1 = new Box();
        b1.display();
        Box b2 =new Box(4,3,2);
        b2.display();
        Box b3 =new Box(4);
        b3.display();
    }
}