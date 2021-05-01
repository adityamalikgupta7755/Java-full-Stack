class I
{}
class J extends I
{}
class K extends I
{}

class Test3
{
    public static void main(String[] arg)
    {
        I i1 = new J();
        System.out.println(i1 instanceof I);
        System.out.println(i1 instanceof J);
        System.out.println(i1 instanceof K);
        K k = (K) i1;
    }
}