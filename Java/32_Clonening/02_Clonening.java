class Circle implements Cloneable
{
    int radius;
    Circle(int i){
        radius = i;
    }
    public Object clone()throws CloneNotSupportedException
    {
        return super.clone();
    }
}



class Test1  
{
    public static void main(String[] arg)throws CloneNotSupportedException
    {
        Circle c1 = new Circle(10);
        Circle c2 = (Circle)c1.clone();
        System.out.println(c2.radius);
    }
}