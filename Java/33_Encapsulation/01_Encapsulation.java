class Circle 
{
    private int radius;
    // setter or mutator
    public void setRadius(int r)
    {
        radius =r;
    }
    public int getRadius()
    {
        return radius;
    }
}
class Test
{
    public static void main(String[] arg)
    {
        Circle c1 = new Circle();
        c1.setRadius(10);
        System.out.println(c1.getRadius());
    }
}