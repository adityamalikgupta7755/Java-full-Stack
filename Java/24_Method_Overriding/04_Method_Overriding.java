class G 
{
    int m1()
    {
        System.out.println("m1() G class");
        return 5;
    }
}
class H extends G //error: m1() in H cannot override m1() in G
{
    double m1()
    {
        System.out.println("m1() H class");
        return 2.5;
    }
   // return type double is not compatible with int
}
