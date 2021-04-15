class E 
{
    void m1()
    {
        System.out.println("m1() E class");
    }
}
class F extends E
{
    String m1()//error: m1() in F cannot override m1() in E
    {
        System.out.println("m1() F class");
        return "ab";
    }
    // return type String is not compatible with void
}
