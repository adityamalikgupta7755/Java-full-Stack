class Circle
{
    int radius = 5;
    public static void main(String[] args)
    {
       final Circle c1 = new Circle();
       System.out.println(c1.radius);
       c1.radius=20;
       System.out.println(c1.radius);
       Circle c2 = new Circle();
    //    c1 =c2; //cannot assign a value to final variable c1


    }
}